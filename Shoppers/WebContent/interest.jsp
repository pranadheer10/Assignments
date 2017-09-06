<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registering-Interest <%=application.getInitParameter("applicationName") %>
</title>
</head>
<body>
<div>
<%@include file="menu.jsp" %>
<form action="home_page.jsp" method="post">

<h3>WE ARE REGISTERING CUSTOMER INTEREST</h3>
<table>
<tr>
<td>Enter Name</td><td> :</td><td> <input type="text" name="name" /></td><br>
</tr>
<tr><td>Enter object name</td><td> :</td><td><input type="text" name="objName"></td></tr><br>
<tr><td><input type="submit" value="Register Interest"></td>
</table>
</form>
</div>

<%@include file="Footer.jsp" %>



</body>
</html>