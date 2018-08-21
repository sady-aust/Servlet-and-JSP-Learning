<%@page import="com.toufiq.Modal.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<%
		Customer myCustomer = (Customer)request.getAttribute("aCustomer");
		out.print(myCustomer.toString());
	%>
</body>
</html>