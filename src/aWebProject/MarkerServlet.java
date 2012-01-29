package aWebProject;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MarkerServlet
 */
@WebServlet("/MarkerServlet")
public class MarkerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    try {
	        List<Marker> markers = MarkerDAO.list();
	        request.setAttribute("markers", markers); // Will be available as ${markers} in JSP
	        request.getRequestDispatcher("/awebproject/").forward(request, response);
	    } catch (SQLException e) {
	        throw new ServletException("Cannot obtain products from DB", e);
	    }
	}
}
