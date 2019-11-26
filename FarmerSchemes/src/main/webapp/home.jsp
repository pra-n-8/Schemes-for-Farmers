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
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

.navbar {
  overflow: hidden;
  background-color: #333;
}

.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

* {
  box-sizing: border-box;
}

/* Create two equal columns that floats next to each other */
.column {
  float: left;
  width: 50%;
  padding: 10px;
  height: 430px; 
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}

.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
height=90px;
   background-color:black;
   color: white;
   text-align: right;
}


.mySlides {display:none;}
.mySlides {
  display: block;
  width: 100%;
height:400px;
align:middle;
}

p.a { 
 line-height: 1.8;
  text-color:#4DB21D;
}

</style>
</head>
<body>
<header id="header"><img id="logo" src="images/logo.jpg" alt=".">AGRO PRO</header>
<div class="navbar">
  <a class="active" href="#home">Home</a> 
  <a href="#news">About</a>
  <a href="#news">Contact Us</a>
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
    
