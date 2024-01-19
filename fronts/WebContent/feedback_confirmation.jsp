<%@ page import="music_and_movie_prj.*" %>
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
        if (request.getMethod().equalsIgnoreCase("post")) {
            String email = request.getParameter("email");
            String category = request.getParameter("category");
            String comment = request.getParameter("comment");

            Feedback feedbackService = new FeedbackProxy().getFeedback();
            feedbackService.getFeedback(email, category, comment);
        }
    %>
    <h1>Your FeedBack is Submitted successfully</h1>
    <form action="searchMovie.jsp">
        <div class="btn-block">
          <button>login</button>
    	</div>
    </form>
</body>
</html>