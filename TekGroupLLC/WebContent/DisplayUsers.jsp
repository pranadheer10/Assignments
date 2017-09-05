<%@page import="com.dao.RegisterDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.data.Users,com.dao.RegisterDao.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<h1>Users List</h1>

<%
List<Users> list= RegisterDao.getAllRecords();
//List<Users> list=UserDao.getAllRecords();
request.setAttribute("list",list);
%>

<table border="1" width="90%">
<tr><th>Name</th><th>Email</th><th>PhoneNumber</th><th>Password</th><th>Edit</th><th>Delete</th></tr>
<c:forEach items="${list}" var="u">
	<tr><td>${u.getUserName()}</td><td>${u.getEmail()}</td><td>${u.getPhoneNumber()}</td><td>${u.getPassword()}</td><td><a href="Edit.jsp?userName=${u.getUserName()}">Edit</a></td><td><a href="Delete.jsp?userName=${u.getUserName()}">Delete</a></td></tr>
</c:forEach>
</table>
<a class="active" href="Registration.jsp">Add User</a>

</body>
</html>