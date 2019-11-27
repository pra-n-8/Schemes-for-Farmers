<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/Registration.css">

<script type="text/javascript" src="registration.js"></script>
<title>Bidder Registration</title>

</head>
<body>
	<ul class="right">
		<li><a class="active" href="home.jsp">Home</a></li>
	</ul>
	<pre>
<form action="bidderRegistration.lti" method="post" id="registration">
<h1>Bidder Registration</h1>
<label>Name</label><input type="text" name="bidderName" required />
<label>Address</label><input type="text" name="bidderAddress" required />
<label>Email</label><input type="email" name="bidderEmail" required />
<label>City</label><input type="text" name="bidderCity" required />
<label>State</label><input type="text" name="bidderState" required />
<label>PinCode</label><input type="number" name="bidderPinCode"
				class="quantity" required />
<label>Contact</label><input type="number" name="bidderContact"
				class="quantity" title="10 digits required" required />
<label>Aadhar Card</label><input type="number" name="bidderAadharCard"
				class="quantity" size=12 title="12 digits required" required />
<label>Pancard</label><input type="text" name="bidderPanCard" required />
<label>Password</label><input type="password" name="bidderPassword"
				id="bidderPassword" required />
<!-- <label>Confirm Password</label><input type="password" name="confirm_farmerPassword"  id="confirm_bidderPassword"  required/> -->
<input type="submit" value="Submit" />
</form>
</pre>
</body>
</html>