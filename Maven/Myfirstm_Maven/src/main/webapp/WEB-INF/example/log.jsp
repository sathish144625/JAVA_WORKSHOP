
 <%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<s:url var="url" action="Login.action"> </s:url>


Name <br>
<input type = "text" name = "Name" /><br>
PassWord<br>
<input type = "password" name ="PassWord" /><br>

<input type = "Submit"/>

<input type = "Reset"/>
</input>
</from>
<br> <b> &nbsp;
</body>
</html>