<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<style type="text/css">
.container {
	border: 1px solid black;
	padding: 2;
}

.bg{
	
	background-image: url("C:\Users\2115271\Downloads\background\bg.jpeg");

  /* Full height */
  height: 100%;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}

</style>


<title><c:out value="${page }"></c:out></title>
</head>
<body>
	<h1 class="text-center">Registration Form</h1>
	<form action="submitForm" method="post">
		<div class="bg container mt-2">
			<div class="form-group mb-2">
				<label for="mail">Email address</label> <input type="email"
					class="form-control" name="mail" aria-describedby="emailHelp"
					placeholder="Enter email">
			</div>
			<div class="form-group">
				<label for="name">User Name</label> <input type="text"
					class="form-control" name="name" placeholder="Enter name">
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					class="form-control" name="password" placeholder="Password">
			</div>
			<div class="form-group form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1"
					required> <label class="form-check-label"
					for="exampleCheck1">Check me out</label>
			</div>
			

				
			<div class="mb-2">
			<button type="submit" class="btn btn-outline-success">Submit</button>
							
								
	
						
					<!-- <button type="submit" class="btn btn-outline-success">Submit</button> -->

					
			<button type="reset" class="btn btn-primary">Reset</button>
			</div>
		<!-- 	<div class="mb-2">
				<button type="submit" class="btn btn-outline-success">Submit</button>
				<button type="reset" class="btn btn-primary">Reset</button>
			</div> -->

			
	</form>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>