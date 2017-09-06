<%@ page language="java" import="java.util.Date,java.text.SimpleDateFormat,java.text.DateFormat" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home-<%=application.getInitParameter("applicationName") %></title>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;
}
</style>
</head>
<body>
  <%!Date date;  String formattedDate;%>
<%
date= new Date();
DateFormat df= new SimpleDateFormat("dd MMM,YYYY");
formattedDate = df.format(date);
String userName=(String)session.getAttribute("userName");
%> 
<ul>
  <li><a class="active" href="home_page.jsp">Home</a></li>
  <li><a  href="customer.jsp">Customers</a></li>
  <li><a href="interest.jsp">Interest</a></li>
  <li><a  href="sell.jsp">Sell</a></li>
  <li><a  href="buy.jsp">Buy</a></li>
  <li><a  href="inventory.jsp">Inventory</a></li>
  <li><a href="history.jsp">History</a></li>
  <li><a href="about.jsp">About</a></li>
  
</ul>

  
 
<h4>welcome to shoppers.com <%=userName %> </h4>
<h4>todays date is <%=formattedDate %></h4>
<%@include file="Footer.jsp" %>
</body>
</html>