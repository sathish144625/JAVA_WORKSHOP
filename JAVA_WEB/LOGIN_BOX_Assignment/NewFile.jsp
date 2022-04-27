<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
input
{
	margin: 5px;
}
form
{
	padding: 5px;
}
.sundar
{
	margin: 5px;
	width: 5%;
}
</style>
<body>
	<fieldset  class="sundar"><legend>Login Process </legend>
<form name="calc" method="GET"
action="http://localhost:8080/LoginProject/servlets/servlet/MyLoginServlet">
Name <br>
<input type = "text" name = "Name" /><br>
PassWord<br>
<input type = "number" name ="PassWord" /><br>
<input type = "Submit"/>
<input type = "Reset"/>
<br> <b> &nbsp;
 <% 
String strOutput =  request.getParameter("result");
  if(strOutput !=null)
    out.print(strOutput);
%></b>
</body>
</html>