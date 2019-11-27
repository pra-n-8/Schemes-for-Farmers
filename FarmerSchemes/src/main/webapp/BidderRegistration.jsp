<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/Registration.css">
<script type="text/javascript" src="registration.js"></script>
<title>Bidder Registration</title>
<script> 
          
            // Function to check Whether both passwords 
            // is same or not. 
            function checkPassword(form) { 
               	bidderPassword = form.bidderPassword .value; 
                confirm_bidderPassword = form.confirm_bidderPassword.value; 
  
                // If password not entered 
                if (bidderPassword  == '') 
                    alert ("Please enter Password"); 
                      
                // If confirm password not entered 
                else if (confirm_bidderPassword  == '') 
                    alert ("Please enter confirm password"); 
                      
                // If Not same return False.     
                else if (bidderPassword  != confirm_bidderPassword ) { 
                    alert ("\nPassword did not match: Please try again...") 
                    return false; 
                } 
  
                // If same return True. 
                else{ 
                    alert("Password Match: Welcome to Agro Pro!") 
                    return true; 
                } 
            } 
        </script>
</head>
<body>
<pre>
<form action="bidderRegistration.lti" method="post" id="registration">
<h1>Bidder Registration</h1>
<label>Name</label><input type="text" name="bidderName"   required />
<label>Address</label><input type="text" name="bidderAddress" required />
<label>Email</label><input type="email" name="bidderEmail" required  />
<label>City</label><input type="text" name="bidderCity" required />
<label>State</label><input type="text" name="bidderState" required />
<label>PinCode</label><input type="number" name="bidderPinCode" required/>
<label>Contact</label><input type="number" name="bidderContact"  title="10 digits required" required/>
<label>Aadhar Card</label><input type="number" name="bidderAadharCard"  size=12  title="12 digits required" required/>
<label>Pancard</label><input type="text" name="bidderPanCard" required/>
<label>Password</label><input type="password" name="bidderPassword" />
<label>Confirm Password</label><input type="password" name="confirm_farmerPassword" />
<input type="submit" value="Submit" />
</form>
</pre>
</body>
</html>