<%@page import="music_and_movie_prj.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movies And Music</title>
</head>
<body>

<%
//Login_userRequest payload = new Login_userRequest();
String Name = request.getParameter("Name");
String password = request.getParameter("Password");
Login_user Login_service=new Login_userProxy().getLogin_user();
String output = Login_service.login_info(Name, password);
out.println(output);  
%>



</body>
</html>