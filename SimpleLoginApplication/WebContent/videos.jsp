<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//FOR HTTP 1.1 Version
	response.setHeader("Pragma", "no-cache");// HTTP 1.0
	
	response.setHeader("Expires", "0");
	if(session.getAttribute("uname")==null){
		response.sendRedirect("login.jsp");
	}
%>
	Videos
</body>
</html>