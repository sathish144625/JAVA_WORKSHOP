<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Registration page</title>
<script type="text/javascript">
  function isValidate(form) {
	  var username=document.getElementById("username").value;
	  var userpass=document.getElementById("userpassword").value;
	  var userpass1=document.getElementById("userpass1").value;
	  if(userpass != userpass1){
		  alert("The two passwords are not the same, please re-enter!");
		  return false;
	  }else if(userpass.length<=0 || username.length<=0) {
		  alert("User name and password cannot be empty, please re-enter!");
		  return false;
	  }else{
		  return true;
	  }
  }
</script>
</head>
<body>
 <h3 align="left">Welcome to register our system, please fill in your information carefully</h3>
 <form action="/marketplace/register" name="register" method="post" onsubmit="return isValidate()">
  <table>
    <tr><td align="right">Account name:</td>
        <td><input name="user.username" id="username"></td></tr>
    <tr><td align="right">Set password for your account:</td>
        <td><input type="password" name="user.userpassword" id="userpassword"></td></tr>
    <tr><td align="right">Reconfirm your password:</td>
        <td><input type="password" name="userpass1" id="userpass1"></td></tr>
    <tr><td align="right">Real name:</td>
        <td><input name="user.userrealname" id="userrealname"></td></tr>
    <tr><td align="right"><input type="submit" value="Submission"></td>
        <td colspan="2"><input type="reset" value="Rewrite"></td></tr>
   </table>
 </form>
</body>
</html>