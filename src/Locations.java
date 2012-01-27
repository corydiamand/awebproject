import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.annotation.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Locations")
public class Locations extends HttpServlet 
{

  public void doGet(HttpServletRequest inRequest, HttpServletResponse outResponse) throws ServletException, IOException 
  {

    PrintWriter out = outResponse.getWriter();
    Connection connection = null;
    Statement statement;
    ResultSet rs;

    try 
    {
      Class.forName("com.mysql.jdbc.Driver");

      connection = DriverManager.getConnection("jdbc:mysql://localhost/awebproject","root","");
      
      statement = connection.createStatement();

      outResponse.setContentType("test/html");
      
      out = outResponse.getWriter();

      rs = statement.executeQuery("SELECT * FROM locationdata");

     

      while (rs.next()) 
      {
    	  out.println("var marker" + rs.getString("id") + " = new google.maps.Marker(	{" + 
        			"\nmap: map, " +
        			"\nposition: new google.maps.LatLng(" + rs.getFloat("lat")+"," + rs.getFloat("lon") + "), " +
        			"\ntitle: 'Hello World!'" +
        			"\n});"

    			  	 );
      }

    } 
    
    catch (ClassNotFoundException e) 
    {
    	out.println("Driver Error");
    } 
    catch (SQLException e) 
    {
    	out.println("SQLException: " + e.getMessage());
    }
     String locationdata = "7";
    
  //  inRequest.setAttribute("locationdata", locationdata);
 //   inRequest.getRequestDispatcher("/WEB-INF/index.jsp").forward(inRequest,outResponse);
    
  }

  public void doPost(HttpServletRequest inRequest, HttpServletResponse outResponse) throws ServletException, IOException 
      {
	  		doGet(inRequest, outResponse);
      }
}
