<%@page import="com.controller.OrderServlet"%>
<%@page import="java.util.*"%>
<%@page import="com.data.Orders"%>
<%@page session="false"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String userName1=(String)request.getSession().getAttribute("userName"); %>
<% if(userName1!=null){ %>
	

<form action="removeOrder" method="post">
<%@page import="com.data.Items,com.dao.ItemsDao,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<h3>Items List</h3>
<table border="1" width="90%">
<tr><th>Item Number</th><th>Item Name</th><th>Price</th><th>Description</th><th>Quantity</th><th>Total Price</th></tr>

<%
List<Orders> list;
Orders order;
//List<Users> list=UserDao.getAllRecords();
//request.setAttribute("list",list);
list= (List<Orders>)request.getSession().getAttribute("orderList");

if((List<Orders>)request.getSession().getAttribute("orderList")!=null)
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


<c:forEach items="${list}" var="u">
	
</c:forEach>
</table>
<hr >
<h3>Remove items from the Cart</h3>
<table>
<tr>
<td>ItemNumber</td> <td>:</td><td><input type="text" name="itemNumber"></td>
</tr>
<!-- <tr>
<td>No. of items</td> <td>:</td><td><input type="text" name="quantity"></td>
</tr> -->
<tr><td><input type="submit" value="remove Item from Cart"></td></tr>
<tr><td><a href="Checkout.jsp"> Continue to Checkout</a> 
</table>
</form>
<%} 
	else{%>
	<a href="login.jsp">please login to access</a>
<%} %>
</body>
</html>


