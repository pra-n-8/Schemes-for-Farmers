<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="Registration.css">
<script type="text/javascript" src="registration.js"></script>
<title>Bidder Registration</title>
</head>
<body>
<form action="bidderRegistration.lti" method="post">
<label>Name</label><input type="text" name="bidderName" />
<label>Address</label><input type="text" name="bidderAddress" />
<label>Email</label><input type="email" name="bidderEmail" />
<label>City</label><input type="text" name="bidderCity" />
<label>State</label><input type="text" name="bidderState" />
<label>PinCode</label><input type="number" name="bidderPinCode" class="quantity"/>
<label>Contact</label><input type="number" name="bidderContact" class="quantity"/>
<label>Aadhar Card</label><input type="number" name="bidderAadharCard" class="quantity"/>
<label>Pancard</label><input type="text" name="bidderPanCard" />
<label>Password</label><input type="password" name="bidderPassword" />
<label>Confirm Password</label><input type="password" name="confirm_farmerPassword" />
<input type="submit" value="Submit" />
</form>
</body>
</html>