<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Function</title>
</head>
<body>
<c:set var="myName" value="Toufiqul Islam want to be a good programmer"></c:set>

Length: ${fn:length(myName)}

<c:forEach items="${fn:split(myName,' ')}"  var="s">
<br/>
${s}


</c:forEach>
<br/>
<br/>
Index Number of 'be' is :${fn:indexOf(myName,"be")}

<br/>
<br/>

Is There 'good': ${fn:contains(myName,"good") }
<br/>
<br/>

<c:if test="${fn:contains(myName,'good')}">
	Good is Present Here
</c:if>

<br/>
<br/>

<c:if test="${fn:endsWith(myName,'programmer') }">
Sabbas,Toufiq You are a programmer :D
</c:if>
</body>
</html>