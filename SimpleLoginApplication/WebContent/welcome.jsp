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
	
	if(session.getAttribute("uname")==null){
		response.sendRedirect("login.jsp");
	}
%>
Welcome ${uname} 
Videos here <a href="videos.jsp">My Videos</a><br/>

<form action="Logout">
	<input type="submit" value="Logout">
</form>

</body>
</html>