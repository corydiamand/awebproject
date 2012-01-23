<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@  taglib tagdir="/WEB-INF/tags" prefix="tags" %>
<link rel="stylesheet" type="text/css" href="style.css" media="screen">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Just another web project ;)</title>
</head>
<body>
<div id="main">
<tags:header />

Hello World! This is a change!
<% java.util.Date d = new java.util.Date(); %>

<div id="map"></div>
<div id="location-input"></div>
<div id="type-dropdown"></div>

todays date is <%= d.toString() %>

<tags:footer />
</div><!-- main -->
</body>
</html>