<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
	<form name="registration" action="registrationPage" method="post">
		<h4>Welcome to registration form TekGroupUSA</h4>
		<table>
			<tr>
				<td>User Name</td>
				<td>:</td>
				<td><input type="text" id="userName" name="userName""></td>
			
			</tr>
			<tr>
				<td>Email</td>
				<td>:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td>:</td>
				<td><input type="text" name="phoneNumber"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="register"></td>
		</table>
	</form>
	</div>

</body>
</html>