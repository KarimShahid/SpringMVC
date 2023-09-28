<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>

<!-- Using model and view  -->

<%
	String name =(String) request.getAttribute("name");
	int id =(Integer) request.getAttribute("id");
	LocalDateTime t = (LocalDateTime) request.getAttribute("time");

%>

	<h1>This is help page</h1>
	<h3>
		My name is  <%=name %>. My id number is <%=id %>. 
		<br>How can i help you?
	</h3>
	
	
	<footer>
		<%= t %>
	</footer>
	
</body>
</html>