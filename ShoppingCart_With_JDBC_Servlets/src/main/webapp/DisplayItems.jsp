<%@page import="com.dao.ItemsDao"%>
<%@page import="java.util.*"%>
<%@page import="com.data.Items"%>
<%@page session="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

	<form action="placeOrder" method="post">
		<%@page import="com.data.Items,com.dao.ItemsDao,java.util.*"%>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<% String userName=(String)request.getSession().getAttribute("userName"); %>
<% if(userName!=null){ %>
		<h3>Items List</h3>

		<%
			List<Items> list = ItemsDao.getAllRecords();
			//List<Users> list=UserDao.getAllRecords();
			request.setAttribute("list", list);
		%>

		<table border="1" width="90%">
			<tr>
				<th>Item Number</th>
				<th>Item Name</th>
				<th>Price</th>
				<th>Description</th>
			</tr>
			
			<c:forEach items="${list}" var="u">
				<tr>
					<td>${u.getItemNumber()}</td>
					<td>${u.getItemName()}</td>
					<td>${u.getPrice()}</td>
					<td>${u.getDescription()}</td>
				</tr>
			</c:forEach>
		</table>
		<hr>
		<h3>Add items to Cart</h3>
		<table>
			<tr>
				<td>ItemNumber</td>
				<td>:</td>
				<td><input type="text" name="itemNumber"></td>
			</tr>
			<tr>
				<td>No. of items</td>
				<td>:</td>
				<td><input type="text" name="quantity"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add to Cart"></td>
			</tr>
			<tr>
				<td><a href="DisplayOrder.jsp"> Continue to view your
						Orders</a>
		</table>
	</form>
	<%} 
	else{%>
	<a href="login.jsp">please login to access</a>
<%} %>	
</body>
</html>


