<!-- 
Scriptlet
Declarative
Expression
Directive

Exception in jsp
 -->

<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.Statement, java.util.Scanner" errorPage="error.jsp"%>
    
    <!--Include is used to add another jsp file in this jsp file  -->
    <%@include file="headerjsp.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int coeff = 5; %>
<%
int i = Integer.parseInt(request.getParameter("num1"));
int j = Integer.parseInt(request.getParameter("num2"));
int sum = i+j;


//int res = 5/0; //Making an exception for showing error.jsp Page

out.println("Result is "+sum);

%>
<br/>
CoEff is <%=coeff %>
</body>
</html>