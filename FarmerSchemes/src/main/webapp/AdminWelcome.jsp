<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta charset=ISO-8859-1>
<title>Admin Home</title>
<link rel="stylesheet" type="text/css" href="css/InsideHome.css">
</head>
<body>
	<ul class="right">
	<li><a href="logout.lti">Logout</a></li>
		<li><a class="active" href="home.jsp">Home</a></li>
	</ul>
	<section>
<div class="container">
 
 <%
		if (session != null) {
			out.println("<h1 align=\"center\">WELCOME " + session.getAttribute("aname") + "</h1>");
		}
		else{
			
		}
	%>

	<section>
		<div class="container">
			<form method="post" action="showPreviousBids.jsp">
				<div>
					<input type="submit" value="Sell Log " class="btn" />
				</div>
			</form>
			</div>
			<form method="post" action="viewrequests.lti">
				<div>
					<input type="submit" class="btn" value="View Sale Requests" />
				</div>
			</form>
	</section>
</div>
</section>
</body>
</body>
</html>