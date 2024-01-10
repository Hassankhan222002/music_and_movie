<%@ page import="music_and_movie_prj.adding_users" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>feedback</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
    
</head>
    <div class="main-block">
        <h1>Registration</h1>
        <form action="RegisterServlet" method="post">
            <hr>
            <label for="email"><i class="fas fa-envelope"></i></label>
            <input type="text" name="Email" id="email" placeholder="Email" required/>
            <label for="name"><i class="fas fa-user"></i></label>
            <input type="text" name="Name" id="name" placeholder="Name" required/>
            <label for="password"><i class="fas fa-unlock-alt"></i></label>
            <input type="password" name="Password" id="password" placeholder="Password" required/>
            <hr>
            <div class="gender">
                <input type="radio" value="male" id="male" name="gender" checked/>
                <label for="male" class="radio">Male</label>
                <input type="radio" value="female" id="female" name="gender" />
                <label for="female" class="radio">Female</label>
            </div>
            <hr>
            <div class="btn-block">
                <button type="submit">Submit</button>
            </div>
           
           <script>
           
           </script>
        </form>
    </div>
</body>
</html>