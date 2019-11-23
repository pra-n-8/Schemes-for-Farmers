<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/Registration.css">
<title>Farmer Registration</title>
</head>
<body>
<pre>
<form action="farmerRegistration.lti" method="post" id="registration">
<h1>Farmer Registration</h1>
<label>Name:</label><input type="text" name="farmerName" />
<label>Address:</label><input type="text" name="farmerAddress" />
<label>Email:</label><input type="email" name="farmerEmail" />
<label>City:</label><input type="text" name="farmerCity" />
<label>State:</label><input type="text" name="farmerState" />
<label>PinCode:</label><input type="number" name="farmerPinCode" class="quantity"/>
<label>Contact:</label><input type="number" name="farmerContact" class="quantity"/>
<label>Aadhar Card:</label><input type="number" name="farmerAadharCard" class="quantity"/>
<label>Pancard:</label><input type="text" name="farmerPanCard" />
<label>Password:</label><input type="password" name="farmerPassword" />
<label>Confirm Password:</label><input type="password" name="confirm_farmerPassword" />
<input type="submit" value="Submit" />
</form>
</pre>
</body>
</html>