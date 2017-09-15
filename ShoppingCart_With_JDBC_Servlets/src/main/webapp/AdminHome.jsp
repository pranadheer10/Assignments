<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String userName45=(String)request.getSession().getAttribute("userName"); %>
<% if(userName45!=null)
{
	if(userName45.equals("Admin")){
%>

<%@ include file="Home.jsp"%>
<a href="DisplayUsers.jsp">Display Users</a>
<a href="AddItems.jsp">Add Items</a>
<%} %>
<a href="login.jsp">please login to access</a>
<%}
	else{%>
	<a href="login.jsp">please login to access</a>
<%
	}%>
</body>
</html>