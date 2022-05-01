<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Login page</title>
</head>
<body>
 <form action="/marketplace/logincheck" method="post">
 <table>
   <tr><th colspan="2">User login:</th></tr>
   <tr><td align="right">User name:</td><td><input name="user.username"/></td></tr>
   <tr><td align="right">Password:</td>
       <td><input type="password" name="user.userpassword"/></td></tr>
   <tr><td align="left"><input type="submit" value="Sign in"/></td>
       <td>Unregistered person, please register first, click<a href="/marketplace/register.jsp">register</a></td>
       </tr>
 </table>
 </form>
</body>
</html>