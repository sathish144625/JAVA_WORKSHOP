
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Form</title>
  </head>
  <body>
   
	<h3>Create Login Form Validation</h3>
	<h1><s:property value = "errorMessage"/></h1>
	<s:form action="authenticateuser">  
	<s:textfield name="loginModel.username" label="Name"></s:textfield>  
	<s:password name="loginModel.password" label="Password"></s:password>  
	<s:submit value="Login"></s:submit>  
	</s:form> 
  </body>
</html>
