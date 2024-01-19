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

String Name = request.getParameter("Name");
String password = request.getParameter("Password");
String Email = request.getParameter("Email");

User_info User_service=new User_infoProxy().getUser_info();
User_service.getuserinfo(Name, password, Email);

%>
<h1>you have been registered successfully . thankyou hogya tu reg</h1>

   <form action="log.jsp">
       
        
        <div class="btn-block">
          <button>login</button>
        </div>
      </form>
   
</body>
</html>