<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Service Page</title>
</head>
<body>
	<h1>This is services page</h1>


	<p>This is my assistant ${name}.</p>
	<p>He is ${age} old.</p>
	
	<p>He has visited many places</p>
	
	<c:forEach var="item" items="${address}">
		<%-- <p>${item}</p> --%>
		<b> 
			<c:out value="${item}"></c:out>
			<br>
		</b>
	</c:forEach>
</body>
</html>