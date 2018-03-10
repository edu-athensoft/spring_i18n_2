<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
		
		<script src="js/jquery-1.4.2.min.js"></script>
		<script src="js/main.js">
		</script>
	</head>
	<body>
		<div id="header">
			
			<h1>Athensoft </h1>
			
			<div id="navi">
				
				<ul >
					
					<li><a href="index">About us</a></li>
					<li><a href="product_en">Our Products</a></li>
					<li><a href="#">Contact us</a></li>
					
					<li>
						language:<select id="lang" onchange="lanChanged(this)">
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
			<div class="form" id="form" >
					
					<form  action="test" method="get">
						 <p><input type="hidden" name="lang" value="en"/></p>
						 <p>Name:&nbsp;<input type="text" name="name"/></p>
						 <p>Email:&nbsp;&nbsp;<input type="email" name="email" /></p>
						 <p>Content:<textarea name="text"></textarea></p>
						
						 <p><input type="submit" value="Submit"></p>
					</form>
				</div>
				
				<div class="clr"></div>
		</div>
		
		<div id="footer"> 
			<p>Athensoft &copy;2018</p>
		</div>
		
	</body>
</html>
</fmt:bundle>
