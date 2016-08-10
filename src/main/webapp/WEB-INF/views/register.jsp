<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet"
	href='/application/resources/css/register.css' type="text/css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="signuparea">
			<form role="form">
				<div class="form-group">
					<label class="control-label" for="email">Email Address</label> <input
						type="email" class="form-control" id="email"
						placeholder="Enter email">
				</div>
				<div class="form-group">
					<label class="control-label" for="username">User Name</label> <input
						type="text" class="form-control" id="username"
						placeholder="Enter username">
				</div>
				<div class="form-group">
					<label for="password">Password</label> <input type="password"
						class="form-control" id="password" placeholder="Enter password">
				</div>

			</form>
	</div>
</body>
</html>