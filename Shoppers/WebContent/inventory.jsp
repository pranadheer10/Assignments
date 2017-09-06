<%@ page language="java" import="java.util.Date,java.text.SimpleDateFormat,java.text.DateFormat" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inventory-<%=application.getInitParameter("applicationName") %></title>
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


<script type="text/javascript">
  function validate() {
	  
	  var pattern = /^-?[0-9]+(.[0-9]{1,2})?$/;
      var text = document.getElementById('itemNumber').value;
      if (text.match(pattern)==null)
      {
	alert('please give only numbers in item Number');
      return false;
      }
  else  
  {
	alert('OK');
  
  }
  }
  </script>


</head>
<body>
<ul>
  <li><a class="active" href="home_page.jsp">Home</a></li>
  <li><a  href="customers.jsp">Customers</a></li>
  <li><a href="interest.jsp">Interest</a></li>
  <li><a  href="sell.jsp">Sell</a></li>
  <li><a  href="buy.jsp">Buy</a></li>
    <li><a href="contact.jsp">Contact</a></li>
  <li><a href="about.jsp">About</a></li>
  
</ul>
<div>
<form name= "myform" action="inventoryPage" method="post">
  <%!Date date;  String formattedDate;%>
<%
date= new Date();
DateFormat df= new SimpleDateFormat("dd MMM,YYYY");
formattedDate = df.format(date);
String userName=(String)session.getAttribute("userName");
%> 



<h4>This is the inventory of shoppers.com <%=userName %> </h4>
<table>
<tr>
<td>Enter item number</td><td> :</td><td><input type="text" id="itemNumber" name="itemNumber""></td><br>
</tr>
<tr>
<td>Enter item name to add in inventory</td><td> :</td><td> <input type="text" name="name" /></td><br>
</tr>
<tr><td>Enter Number of objects</td><td> :</td><td><input type="text" name="numberOfObj"></td><br></tr>
<tr><td><input type="submit" value="Inventory"  onclick="validate();">
</table>
</form>
</div>

<%@include file="Footer.jsp" %>

</body>
</html>