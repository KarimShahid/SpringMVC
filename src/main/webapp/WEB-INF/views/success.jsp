<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Successful Signup</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1 class="text-center">${Header}</h1>
		<p class="text-center fs-6">${desc}</p>
		<p class="text-success">${msg}</p>
		<hr>

		<h3>User Name: ${user.name}</h3>
		<h3>User Email: ${user.email }</h3>
		<h3>User Password: ${user.password}</h3>
	</div>
</body>
</html>