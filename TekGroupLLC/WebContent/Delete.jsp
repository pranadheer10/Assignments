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
<%
String userName=request.getParameter("userName");
RegisterDao.delete(userName);
%>
deleted successfully
<a class="active" href="Registration.jsp">Register</a>
<a href="Home.jsp">Home</a>
</body>
</html>