<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Object</title>
</head>
<body>
<%

String name = request.getParameter("name");

if(name!=null && name.length()!=0){
	session.setAttribute("sessionusername", name);
	//application.setAttribute("applicationusername", name);
//	pageContext.setAttribute("pagecontextusername", name);
	//pageContext.setAttribute("applicationusername", name,PageContext.APPLICATION_SCOPE);
}

%>

user name in the request Object is: <%=name %>
<br>
user name in the session object is <%=session.getAttribute("sessionusername") %>
<br>
user name in the application context is <%=application.getAttribute("applicationusername") %>

<br>
user name in the page context is <%=pageContext.getAttribute("pagecontextusername") %>

</body>
</html>