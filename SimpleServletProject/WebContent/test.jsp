<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple jsp Page</title>
</head>
<body>
	<h3>Testing jsp</h3>
	
	<%
		int i= 2;
		int k = 3;
		//out.println("Sum is "+(i+k));
		int sum = i+k;
		
	
	%>
	
	The Sum is <%=3+5 %>!!
	<br>
	<%!
		public int sum(int a,int b){
			return a+b;
		}
	%>
	
	<%
		int mySum = sum(10,15);
	%>
	
	<%
		for(int j=0;j<5;j++){
			%>
				j is <%=j %>
				<br>
			<% 
		}
	%>
	<br>
	New Sum is <%=mySum %>
</body>
</html>