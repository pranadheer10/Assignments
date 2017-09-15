<%@page import="com.dao.RegisterDao"%>
<%@ page language="java" import="java.util.*, java.text.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%= (String)request.getAttribute("servletName") %>- <%= application.getInitParameter("applicationName") %></title>
</head>
<body>
<% String myName=(String)request.getSession().getAttribute("userName"); %>
<% if(myName!=null){ %>
<%@page import="com.data.Users,com.dao.RegisterDao.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="Menu.jsp"%>

<%
	Date date;
	String formattedDate;
	String userName1;
%>
<%
date = new Date();
DateFormat df= new SimpleDateFormat("dd MMM, YYYY");

formattedDate= df.format(date);
userName1= (String)request.getAttribute("userName");
%>
<%= userName1= (String)session.getAttribute("userName") %>Welcome to home page <%= formattedDate %> !

<%
Users u= RegisterDao.getRecordByName(userName1);
%>

<table>
	<tr>
	<td>UserName</td>
	<td>:</td>
	<td><%=userName1 %></td>
	</tr>
	<tr>
	<td>Email</td>
	<td>:</td>
	<td><%= u.getEmail()%></td>
	</tr>
	<tr>
	<td>Phone Number</td>
	<td>:</td>
	<td><%= u.getPhoneNumber()%></td>
	</tr>
	<tr>
	<td><a href="Edit.jsp?userName=<%= u.getUserName()%>">Edit</a></td>
	</tr>
</table>
<%} 
	else{%>
	<a href="login.jsp">please login to access</a>
<%} %>
</body>
</html>
