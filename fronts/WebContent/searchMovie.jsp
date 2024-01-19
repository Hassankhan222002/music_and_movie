<%@ page import="music_and_movie_prj.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Movies And Music</title>
</head>
<body>



<h1>Search Movie</h1>

<!-- Form to search for a movie -->
<form action="searchMovie.jsp" method="post">
    <label for="movieNameToSearch">Enter Movie Name:</label>
    <input type="text" name="movieNameToSearch" id="movieNameToSearch" required/><br>

    <button type="submit">Search Movie</button>
</form>

<%
    // Check if the form is submitted
    if (request.getMethod().equalsIgnoreCase("post")) {
        // Retrieve user input
        String movieNameToSearch = request.getParameter("movieNameToSearch");
        Searching search = new SearchingProxy().getSearching();
        // Search for the movie details
        search.search_movie(movieNameToSearch);
        // Display the movie details
%>
        <h2>Search Results for Movie: <%= movieNameToSearch %></h2>
        <table border="1">
            <tr>
                <th>Movie Name</th>
                <th>Genre</th>
                <th>Status</th>
                <th>Category</th>
            </tr>
            <tr>
                <td><%= movieNameToSearch %></td>
        		<td><%= search.genre() %></td>
        		<td><%= search.status() %></td>
        		<td><%= search.category() %></td>
            </tr>
        </table>
<%
    }
%>
<form action="Feedback.jsp">
        <div class="btn-block">
          <button>Feedback</button>
    	</div>
    </form>


</body>
</html>
