<%@ page session="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<body>


 
<%

	out.print("<b>HI FROM JSP</b>");

	for(int i=1; i<7; i++)
	{
		out.print("<h" +  i  +  " >MY HEADING  "+ i +"</h" + i  + ">");
	}

	String name = "sathish";
	for(int i=0;i<5;i++)
	{
		out.print("<b>name</b>"+name);
	} 



%>
</body>
</html>