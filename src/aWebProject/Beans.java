package aWebProject;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Beans
 */
@WebServlet("/Beans")
public class Beans 
{
	
       

	public String bean = "Hello World!";
	
	public String getBean()
	{
		return bean;
	}
	
}
	
