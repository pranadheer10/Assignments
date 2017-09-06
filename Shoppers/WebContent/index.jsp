<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login-<%=application.getInitParameter("applicationName") %></title>
</head>
<body>
<div>
<form action="loginPage" method="post">

Welcome to Shoppers.com
<table>
<tr>
<td>User Name</td><td> :</td><td> <input type="text" name="name" /></td><br>
</tr>
<tr><td>Password</td><td> :</td><td><input type="password" name="password"></td></tr><br>
<tr><td><input type="submit" value="login"></td>
</table>
</div>

<%@include file="Footer.jsp" %>

</form>
</body>
</html>