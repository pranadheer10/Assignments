<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login- <%= application.getInitParameter("applicationName") %></title>
</head>
<body>

	<form action="Login" method="post">


		<h3>Welcome to TekGroup please login</h3>
		<table>

			<tr>
				<td>User name</td>
				<td>:</td>
				<td><input type="text" name="userName"></td>
			</tr>

			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="password" name="password"></td>
			</tr>

			<tr>
				<td><input type="submit" value="login"></td>
				<td><a class="active" href="Registration.jsp">Register</a></td>
			</tr>


		</table>


	</form>

</body>
</html>