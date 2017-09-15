<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.controller.OrderServlet"%>
<%@page import="java.util.*"%>
<%@page import="com.data.Orders"%>
<%@page session="false"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String userName1=(String)request.getSession().getAttribute("userName"); %>
<% if(userName1!=null){ %>
	

<form action="checkOut" method="post">

<h3>Items List</h3>
<table border="1" width="90%">
<tr><th>Item Number</th><th>Item Name</th><th>Price</th><th>Description</th><th>Quantity</th><th>Total Price</th></tr>

<%
List<Orders> list= (List<Orders>)request.getSession().getAttribute("orderList");
for(Orders t:list)
{
String itemsNumber=t.getItems().getItemNumber();
String itemsName=t.getItems().getItemName();
Integer price=Integer.parseInt(t.getItems().getPrice());
String description= t.getItems().getDescription();
Integer quantity= Integer.parseInt(t.getQuantity());
Integer totalPrice=quantity*price;
%>
<tr><td><%=itemsNumber %></td><td><%= itemsName%></td><td><%= price%></td><td><%= description%></td><td><%= quantity%></td><td><%= totalPrice%></td></tr>	

<%}
%>

<input type="submit" value="checkout">
</form>
<%} 
	else{%>
	<a href="login.jsp">please login to access</a>
<%} %>
</body>
</html>