<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/Registration.css">
<script type="text/javascript" src="registration.js"></script>
<title>Farmer Registration</title>
<script> 
          
            // Function to check Whether both passwords 
            // is same or not. 
            function checkPassword(form) { 
               	farmerPassword = form.farmerPassword .value; 
                confirm_farmerPassword = form.confirm_farmerPassword.value; 
  
                // If password not entered 
                if (farmerPassword  == '') 
                    alert ("Please enter Password"); 
                      
                // If confirm password not entered 
                else if (confirm_farmerPassword  == '') 
                    alert ("Please enter confirm password"); 
                      
                // If Not same return False.     
                else if (farmerPassword  != confirm_farmerPassword ) { 
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
<form action="farmerRegistration.lti" method="post" id="registration">
<h1>Farmer Registration</h1>
<label>Name:</label><input type="text" name="farmerName" required/>
<label>Address:</label><input type="text" name="farmerAddress" required />
<label>Email:</label><input type="email" name="farmerEmail" required/>
<label>City:</label><input type="text" name="farmerCity" required/>
<label>State:</label><input type="text" name="farmerState" required/>
<label>PinCode:</label><input type="number" name="farmerPinCode" class="quantity" required/>
<label>Contact:</label><input type="number" name="farmerContact" class="quantity" title="10 digits required" required/>
<label>Aadhar Card:</label><input type="number" name="farmerAadharCard" class="quantity" size=12  title="12 digits required" required/>
<label>Pancard:</label><input type="text" name="farmerPanCard" required />
<label>Password:</label><input type="password" name="farmerPassword" />
<label>Confirm Password:</label><input type="password" name="confirm_farmerPassword" />
<input type="submit" value="Submit" />
</form>
</pre>
</body>
</html>