package aWebProject;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet("/MarkerMethods")
public class Marker /*implements java.io.Serializable*/  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private float lat;
	private float lon;
	
	//getters and setters
	
	//id
	public long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id=id;
	}
	
	//lat
	public float getLat()
	{
		return lat;
	}
	
	public void setLat(float lat)
	{
		this.lat=lat;
	}

	//lon
	public float getLon()
	{
		return lon;
	}
	
	public void setLon(float lon)
	{
		this.lon=lon;
	}
	
	 public boolean equals(Object other) 
	 {
	        return (other instanceof Marker) && (id != null) ? id.equals(((Marker) other).id) : (other == this);
	 }
	
	 public int hashCode() 
	 {
	     return (id != null) ? (getClass().hashCode() + id.hashCode()) : super.hashCode();
	 }
	 public String toString() 
	 { 
	     return String.format("Marker[id=%d,lat=%d,lon=%d]", id, lat, lon);
	 }
}
