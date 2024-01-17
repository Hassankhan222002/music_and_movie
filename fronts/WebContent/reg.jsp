<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
</head>
<body>

    <div class="main-block">
      <h1>Registration</h1>
      <form action="reg_request.jsp">
        <hr>
        <label id="icon"><i class="fas fa-envelope"></i></label>
        <input type="text" name="Email" id="name" placeholder="Email" required/>
        <label id="icon"><i class="fas fa-user"></i></label>
        <input type="text" name="Name" id="name" placeholder="Name" required/>
        <label id="icon"><i class="fas fa-unlock-alt"></i></label>
        <input type="password" name="Password" id="name" placeholder="Password" required/>
        
        <hr>
        <div class="btn-block">
          <button>submit</button>
        </div>
      </form>
    </div>


</body>
</html>