<%@ page import="java.util.Date"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>


<link rel="stylesheet" type="text/css" href="style.css" media="screen">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Just another web project ;)</title>

 <script type="text/javascript"
      src="http://maps.googleapis.com/maps/api/js?key=AIzaSyDj5NRHn6nfzfYopzd9xnoW5As1yZu6cYA&sensor=true">
    </script>
    <script type="text/javascript">
      function initialize() 
      {
        var myOptions = 
        {
          center: new google.maps.LatLng(40.769069,-73.988335),
          zoom: 15,
          mapTypeId: google.maps.MapTypeId.ROADMAP
        };
        var map = new google.maps.Map(document.getElementById("map_canvas"),
            myOptions);
        
        var marker = new google.maps.Marker(
        		{
        			map: map, 
        			position: new google.maps.LatLng(40.769069,-73.988335),
        			title:"Hello World!"
        		});
      }
    </script>

</head>
<body onload="initialize()">
<div id="main">
<tags:header />


Hello World! This is a change!
<% java.util.Date d = new java.util.Date(); %>

<div id="map">

<div id="map_canvas" style="width:100%; height:100%"></div><!-- map_canvas -->
</div><!-- map -->
<div id="location-input"></div><!-- location-input -->
<div id="type-dropdown"></div><!-- type-dropdown -->

todays date is <%= d.toString() %>

<tags:footer />
</div><!-- main -->
</body>
</html>