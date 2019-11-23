<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="farmerRegistration.lti" method="post">
<label>Name</label><input type="text" name="farmerName" />
<label>Address</label><input type="text" name="farmerAddress" />
<label>Email</label><input type="email" name="farmerEmail" />
<label>City</label><input type="text" name="farmerCity" />
<label>State</label><input type="text" name="farmerState" />
<label>PinCode</label><input type="number" name="farmerPinCode" />
<label>Contact</label><input type="number" name="farmerContact" />
<label>Aadhar Card</label><input type="number" name="farmerAadharCard" />
<label>Pancard</label><input type="text" name="farmerPanCard" />
<lable>Password</lable><input type="password" name="farmerPassword" />
<lable>Confirm Password</lable><input type="password" name="confirm_farmerPassword" />
<input type="submit" value="Submit" />
</form>
</body>
</html>