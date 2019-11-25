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
<%
if(session.getAttribute("fid")!=null){
	out.print("<p1>Hello,"+session.getAttribute("fname")+"</p>");
}
%>
  <form id="contact" action="placeCrops.lti" method="post">
    <h3>Place For Auction</h3>
    <fieldset>
      <input placeholder="Crop Type" type="text" tabindex="1" name="cropType" required autofocus>
    </fieldset>
    <fieldset>
      <input placeholder="Crop Name" type="text" tabindex="2" name="cropName" required>
    </fieldset>
    <fieldset>
      <input placeholder="Fertilizer Type" type="text" tabindex="3" name="fertilizerType" required>
    </fieldset>
    <fieldset>
      <input placeholder="Crop Quantity" type="text" tabindex="3" name="quantity" required>
    </fieldset>
    <fieldset>
      <input placeholder="Crop Price" type="text" tabindex="3" name="rate" required>
    </fieldset>
    <fieldset>
      <input placeholder="Expiry Time" type="datetime" tabindex="3" name="expiryTime" required>
    </fieldset>
    <fieldset>
      <button name="submit" type="submit" id="contact-submit" data-submit="...Sending">Submit</button>
    </fieldset>
  </form>
</div>
</body>
</html>