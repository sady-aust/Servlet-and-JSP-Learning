<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process</title>

<jsp:useBean id="user" class="com.toufiq.javabrains.gto.User" scope="request">
	<%-- 
		<jsp:setProperty property="userName" name="user" param="userName"/>
	--%>
	
	<%--
		<jsp:setProperty property="userName" name="user"/>
	--%>
	<jsp:setProperty property="*" name="user"/>
	
</jsp:useBean>


Hello <jsp:getProperty property="userName" name="user"/>
<br>
Your User id is <jsp:getProperty property="userId" name="user"/>
</head>
<body>

</body>
</html>