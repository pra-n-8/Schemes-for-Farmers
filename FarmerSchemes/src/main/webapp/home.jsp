<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="css/design.css">

</head>
<body>
<header id="header"><h1><img id="logo" src="images/logo.jpg" alt=".">AGRO PRO</h1></header>
<div class="navbar">
  <a class="active" href="#home">Home</a> 
  <div class="dropdown">
    <button class="dropbtn">Login 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="AdminLogin.jsp">Admin</a>
      <a href="BidderLogin.jsp">Bidder</a>
      <a href="FarmerLogin.jsp">Farmer</a>
    </div>
  </div> 
</div>
 <div class="row">
  <div class="column" style="background-color:#aaa;">
	<img class="mySlides" src="images/image.jpg">
	<img class="mySlides" src="images/img1.jpg">
	<img class="mySlides" src="images/img2.jpeg">
	<img class="mySlides" src="images/img3.jpg">
	<img class="mySlides" src="images/img4.jpg">
  </div>
 <div class="column">
    <div> <h2>VISION</h2>
<p class="a">To promote uniformity in agriculture marketing by streamlining of procedures across the integrated markets, 
removing information asymmetry between buyers and sellers and promoting real time price discovery based on actual demand and supply.</p>
  </div>
<div><h2> MISSION</h2>
<p class="a">Integration of APMCs across the country through a common online market platform to facilitate pan-India trade in agriculture commodities, 
providing better price discovery through transparent auction process based on quality of produce along with timely online payment. </p>
</div>
</div>
<script>
var slideIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none"; 
  }
  slideIndex++;
  if (slideIndex > x.length) {slideIndex = 1} 
  x[slideIndex-1].style.display = "block"; 
  setTimeout(carousel, 2000); 
}
</script>

<div class="footer">
  <p>Contact information:9380605030</p>
</div>
</body>
</html>

