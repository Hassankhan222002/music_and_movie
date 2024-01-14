package music_and_movie_prj;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FeedbackServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String email = request.getParameter("email");
        String category = request.getParameter("category");
        String comment = request.getParameter("comment");

        // Call the Feedback service
        Feedback feedbackService = new FeedbackProxy().getFeedback();
        feedbackService.getFeedback(email, category, comment);

        // Redirect to a confirmation page or perform other actions as needed
        response.sendRedirect("feedback_confirmation.jsp");
    }
}
