<%

String name = request.getParameter("firstname");
String name1 = request.getParameter("lastname");
String age = request.getParameter("age");
String dob = request.getParameter("dateofbirth");
String ge = request.getParameter("gender");
String add = request.getParameter("address");
String add1 = request.getParameter("address");
String ph = request.getParameter("phonenumber");
String ph1 = request.getParameter("emargencyphonenumber");
String em = request.getParameter("email");
String ps = request.getParameter("password");
String ga = request.getParameter("gradute");
String up = request.getParameter("photo");
String dt = request.getParameter("time");

out.print("User First Name ..."+ name + "<br>");
out.print("User Last Name..."+ name1 + "<br>");
out.print("User Age..."+ age + "<br>");
out.print("User Date Of Birth..."+ dob + "<br>");
out.print("User Gender..."+ ge + "<br>");
out.print("User Current Address..."+ add + "<br>");
out.print("User Parmanent Address..."+ add1 + "<br>");
out.print("User Phone Number..."+ ph + "<br>");
out.print("User Emargency Phone Number..."+ ph1 + "<br>");
out.print("User E-mail..."+ em + "<br>");
out.print("User Password..."+ ps + "<br>");
out.print("User Gradute..."+ ga + "<br>");
out.print("User User Photo..."+ up + "<br>");
out.print("User Date&Time..."+ dt + "<br>");



%>