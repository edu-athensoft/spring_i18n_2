<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<fmt:setLocale value="en_US"/> 
<fmt:bundle basename="language">

<html>
	<head>
		<meta charset="utf-8" />
		<title>athensoft</title>
		<link rel="stylesheet" href="css/style.css"/>
	</head>
	<script src="js/jquery-1.4.2.min.js"></script>
	<script src="js/main.js">
	</script>
	<body>
		<div id="header">
			
			<h1>Athensoft </h1>
			
			<div id="navi">
				
				<ul >
					<li><a href="#"><fmt:message key="aboutus"/></a></li>
					<li><a href="product_en">	 <fmt:message key="ourproducts"/>
</a></li>
					<li><a href="contact_en">	 <fmt:message key="contactus"/>
</a></li>
					<li>
	 <fmt:message key="language"/>:
							<select id="lang"  onchange="lanChanged(this)">
							<option value ="en" selected="selected">English</option>
						    <option value ="fr">FranÃ§ais</option>
						    <option value ="zh">ä¸­æ</option>
						</select>
					</li>
					
				</ul>
				
			</div>
			<div class="clr"></div>
		</div>
			<div id="main">
			<p>
			 <fmt:message key="welcome"/>

			</p>
			
			
		</div>
		
		<div id="footer"> 
			<p>Athensoft &copy;2018</p>
		</div>
		
	</body>
</html>
</fmt:bundle>
