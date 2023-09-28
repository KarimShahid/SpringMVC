<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Contact</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<div class="container mt-5">
		<h3 class="text-center">${Header}</h3>
		<p class="text-center fs-6">${desc}</p>

		<form action="processForm" method="post">
			<!-- The form will go to this url -->
			<div class="mb-3">
				<label for="userName" class="form-label">User Name</label> <input
					type="text" class="form-control" name="name" id="userName"
					aria-describedby="emailHelp" placeholder="Enter username">
			</div>

			<div class="mb-3">
				<label for="userEmail" class="form-label">Email address</label> <input
					type="email" class="form-control" name="email" id="userEmail"
					aria-describedby="emailHelp" placeholder="Enter Email">
			</div>


			<div class="mb-3">
				<label for="userPassword" class="form-label">Password</label> <input
					type="password" class="form-control" name="password"
					id="userPassword" placeholder="Enter Password">
			</div>

			<div class="text-center">
				<button type="submit" class="btn btn-success">Sign up</button>
			</div>



		</form>
	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>