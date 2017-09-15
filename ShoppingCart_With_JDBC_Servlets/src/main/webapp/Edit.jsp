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
<% String userName1=(String)request.getSession().getAttribute("userName"); %>
<% if(userName1!=null){ %>

	
<%@page import="com.data.Users,com.dao.RegisterDao.*,java.util.*"%>
<%
String userName=request.getParameter("userName");
Users u= RegisterDao.getRecordByName(userName);
String sessionUser= (String)session.getAttribute("userName");

%>



<div>
	<form name="registration" action="editPage" method="post">
	
	<%= sessionUser %>
	<input type="hidden" name="originalUserName" value="<%=u.getUserName() %>"/>
	<input type="hidden" name="sessionUser" value="<%=sessionUser %>"/>

		<h4>Welcome to registration form TekGroupUSA</h4>
		<table>
			<tr>
				<td>User Name</td>
				<td>:</td>
				<td><input type="text" id="userName" name="userName" value=<%= u.getUserName()%>></td>
			
			</tr>
			<tr>
				<td>Email</td>
				<td>:</td>
				<td><input type="text" name="email" value=<%= u.getEmail()%>></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td>:</td>
				<td><input type="text" name="phoneNumber" value=<%= u.getPhoneNumber()%>></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="password" name="password" value=<%= u.getPassword()%>></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="save">
		</table>
	</form>
	</div>
<%} 
	else{%>
	<a href="login.jsp">please login to access</a>
<%} %>
</body>
</html>