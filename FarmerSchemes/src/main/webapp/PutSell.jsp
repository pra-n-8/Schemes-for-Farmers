<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/Place_Req.css">
<title>Sell Crops</title>
</head>
<body>
<div class="container">  
  <form id="contact" action="" method="post">
    <h3>Place Sell Request</h3>
    <fieldset>
      <input placeholder="Crop Type" type="text" tabindex="1" required autofocus>
    </fieldset>
    <fieldset>
      <input placeholder="Crop Name" type="text" tabindex="2" required>
    </fieldset>
    <fieldset>
      <input placeholder="Fertilizer Type" type="text" tabindex="3" required>
    </fieldset>
    <fieldset>
      <input placeholder="Quantity" type="number" tabindex="4" class="quantity" required>
    </fieldset>
    <fieldset>
      <input placeholder="Soil ph Certificate" type="number" tabindex="5" class="quantity" required>
    </fieldset>
  
    <fieldset>
      <button name="submit" type="submit" id="contact-submit" data-submit="...Sending">Submit</button>
    </fieldset>
  </form>
</div>
</body>
</html>