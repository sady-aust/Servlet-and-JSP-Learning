<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Init param test in JSP</title>
</head>
<body>
<%!
	public void jspInit(){
			String name = getServletConfig().getInitParameter("defaultuser");
			ServletContext context = getServletContext();
			context.setAttribute("defaultuser", name);
	}

%>
The default user from the servlet confiq is : <%=getServletConfig().getInitParameter("defaultuser") %>
<br>
The value in Applicationcontext is:<%=getServletContext().getAttribute("defaultuser") %>
</body>
</html>