package aWebProject;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import aWebProject.Marker;;

/**
 * Servlet implementation class Markers
 */


public class MarkerDAO 
{
	
	
		public static List<Marker> list() throws SQLException 
		{
		
			Connection connection = null;
			Statement statement;
			ResultSet rs;
			List<Marker> markers = new ArrayList<Marker>();
			
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");

				connection = DriverManager.getConnection("jdbc:mysql://localhost/awebproject","root","");
	      
				statement = connection.createStatement();

				rs = statement.executeQuery("SELECT * FROM locationdata");
				
				
			
				while (rs.next()) 
				{
		
					  Marker marker = new Marker();
					  marker.setId(rs.getLong("id"));
					  marker.setLat(rs.getFloat("lat"));
					  marker.setLon(rs.getFloat("lon"));
					  markers.add(marker);
		
				}
				
			}

	     
	    
			catch (ClassNotFoundException e) { } 
			catch (SQLException e) {  }
			
			
			
			return markers;
			
			
			
			
		
	    }
	
		
    
		
	  


	}