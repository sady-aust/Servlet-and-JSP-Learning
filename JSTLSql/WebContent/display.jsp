<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/labmid" user="root" password=""/>
<sql:query var="rs" dataSource="${db}">SELECT * FROM customer</sql:query>
<c:forEach items="${rs.rows}" var="customer">
	<c:out value="${customer.Name}"></c:out><br/>
</c:forEach>
</body>
</html>