<%@ page language="java" import="java.util.Date,java.text.SimpleDateFormat,java.text.DateFormat" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer-<%=application.getInitParameter("applicationName") %></title>
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
<ul>
  <li><a class="active" href="home_page.jsp">Home</a></li>
  <li><a  href="customers.jsp">Customers</a></li>
  <li><a href="interest.jsp">Interest</a></li>
  <li><a  href="sell.jsp">Sell</a></li>
  <li><a  href="buy.jsp">Buy</a></li>
    <li><a href="history.jsp">History</a></li>
  <li><a href="about.jsp">About</a></li>
  
</ul>
<div>
<form action="customerPage" method="post">
  <%!Date date;  String formattedDate;%>
<%
date= new Date();
DateFormat df= new SimpleDateFormat("dd MMM,YYYY");
formattedDate = df.format(date);
String userName=(String)session.getAttribute("userName");
%> 


<table>


    <ul class="errorMessages"></ul>
    

<tr>
    <div>
       <td> <label for="name">Name</label></td><td> :</td>
        <td><input id="name" type="text" required></td><br>
    </div>
</tr>


<tr>

<div>
<td>
<label for="comments">E-mail</label></td><td> :</td><td><input id="comments" required/></td> 
        
    </div>


<tr><td>
    <div class="buttons">
        <button>Submit</button>
    </div>
</table>
</form></div>
<script>
    var createAllErrors = function() {
        var form = $( this ),
            errorList = $( "ul.errorMessages", form );

        var showAllErrorMessages = function() {
            errorList.empty();

            // Find all invalid fields within the form.
            var invalidFields = form.find( ":invalid" ).each( function( index, node ) {

                // Find the field's corresponding label
                var label = $( "label[for=" + node.id + "] "),
                    // Opera incorrectly does not fill the validationMessage property.
                    message = node.validationMessage || 'Invalid value.';

                errorList
                    .show()
                    .append( "<li><span>" + label.html() + "</span> " + message + "</li>" );
            });
        };

        // Support Safari
        form.on( "submit", function( event ) {
            if ( this.checkValidity && !this.checkValidity() ) {
                $( this ).find( ":invalid" ).first().focus();
                event.preventDefault();
            }
        });

        $( "input[type=submit], button:not([type=button])", form )
            .on( "click", showAllErrorMessages);

        $( "input", form ).on( "keypress", function( event ) {
            var type = $( this ).attr( "type" );
            if ( /date|email|month|number|search|tel|text|time|url|week/.test ( type )
              && event.keyCode == 13 ) {
                showAllErrorMessages();
            }
        });
    };
    
    $( "form" ).each( createAllErrors );
</script>





<%@include file="Footer.jsp" %>

</body>
</html>