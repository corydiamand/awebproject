

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Locations
 */
@WebServlet("/Locations")
public class Locations extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5684466977090319069L;

	@SuppressWarnings("null")
	public void doGet(HttpServletRequest inRequest,
		      HttpServletResponse outResponse) throws ServletException,
		      IOException {

		    PrintWriter out = null;
		    Connection connection = null;
		    Statement statement;
		    ResultSet rs;

		    try {
		      Class.forName("com.mysql.jdbc.Driver");

		      connection = DriverManager
		          .getConnection("jdbc:mysql://localhost/products");
		      statement = connection.createStatement();

		      outResponse.setContentType("test/html");
		      out = outResponse.getWriter();

		      rs = statement.executeQuery("SELECT ID, title, price FROM product");

		      out.println("<HTML><HEAD><TITLE>Products</TITLE></HEAD>");
		      out.println("<BODY>");
		      out.println("<UL>");

		      while (rs.next()) {
		        out.println("<LI>" + rs.getString("ID") + " "
		            + rs.getString("title") + " " + rs.getString("price"));
		      }

		      out.println("</UL>");
		      out.println("</BODY></HTML>");
		    } catch (ClassNotFoundException e) {
		      out.println("Driver Error");
		    } catch (SQLException e) {
		      out.println("SQLException: " + e.getMessage());
		    }
		  }

		  public void doPost(HttpServletRequest inRequest,
		      HttpServletResponse outResponse) throws ServletException,
		      IOException {
		    doGet(inRequest, outResponse);
		  }
		}
