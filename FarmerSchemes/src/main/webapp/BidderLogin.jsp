<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bidder Login Page</title>
<link rel="stylesheet" type="text/css" href="css/design.css">
</head>
<body>
	<fieldset style="margin-left: 400px; margin-right: 400px;">
		<legend style="text-align: center;">
			<h1>Bidder Login</h1>
		</legend>
		<form action="bidderlogin.lti" method="post">
			<div class="imgcontainer">
				<img src="images/adminIcon.jpg" name="img1">
			</div>

			<div class="container">
				<label for="uname"><b>Username</b></label> <input type="text"
					placeholder="Enter Username" name="username" required> 
				<label for="psw"><b>Password</b></label> <input type="password"
					placeholder="Enter Password" name="pass" required>
				<button type="submit">Login</button>
			</div>
			
		<div><a href="BidderRegistration.jsp">New user ? Register here!</a></div>
		</form>
</body>
</html> 