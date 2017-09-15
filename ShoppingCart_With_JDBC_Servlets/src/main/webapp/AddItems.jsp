<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String userName=(String)session.getAttribute("userName");
%>
<%if(userName!=null){ %>
<div>
	<form name="addItems" action="addItemsPage" method="post">
		<h4>Welcome to registration form TekGroupUSA</h4>
		<table>
			<tr>
				<td>Item Number</td>
				<td>:</td>
				<td><input type="text" id="itemNumber" name="itemNumber"></td>
			
			</tr>
			<tr>
				<td>Item Name</td>
				<td>:</td>
				<td><input type="text" name="itemName"></td>
			</tr>
			<tr>
				<td>Price</td>
				<td>:</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td>Description</td>
				<td>:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Add Items"></td>
		</table>
	</form>
	</div>
<%} 
else{
	%>
	<a class="active" href="login.jsp">Login Page</a>
	<%
}%>
</body>
</html>