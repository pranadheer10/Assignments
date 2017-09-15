<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}


li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;
}
</style>
</head>
<body>
<% String myNam=(String)request.getSession().getAttribute("userName"); %>
<% if(myNam!=null){ %>
<ul>
	
  <li><a class="active" href="Home.jsp">Home</a></li>
  <li><a href="Contact.jsp">Contact</a></li>
  <li><a href="About.jsp">About</a></li>
  <li><a href="DisplayItems.jsp">Display Items</a>
  <li><a href="login.jsp">LogOut</a>
  
</ul>
<%} 
	else{%>
	<a href="login.jsp">please login to access</a>
<%} %>
</body>

</html>
