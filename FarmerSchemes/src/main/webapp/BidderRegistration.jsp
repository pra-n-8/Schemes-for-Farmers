<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="bidderRegistration.lti" method="post">
<label>Name</label><input type="text" name="bidderName" />
<label>Address</label><input type="text" name="bidderAddress" />
<label>Email</label><input type="email" name="bidderEmail" />
<label>City</label><input type="text" name="bidderCity" />
<label>State</label><input type="text" name="bidderState" />
<label>PinCode</label><input type="number" name="bidderPinCode" />
<label>Contact</label><input type="number" name="bidderContact" />
<label>Aadhar Card</label><input type="number" name="bidderAadharCard" />
<label>Pancard</label><input type="text" name="bidderPanCard" />
<lable>Password</lable><input type="password" name="bidderPassword" />
<lable>Confirm Password</lable><input type="password" name="confirm_farmerPassword" />
<input type="submit" value="Submit" />
</form>
</body>
</html>