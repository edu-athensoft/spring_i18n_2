<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
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
					<li><a href="index">About us</a></li>
					<li><a href="#">Our Products</a></li>
					<li><a href="contact_en">Contact us</a></li>
					<li>
						language:<select id="lang" name="lang" onchange="lanChanged(this)">
							  <option value ="en">English</option>
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
				there are some products
			</p>
			
			
		</div>
		
		<div id="footer"> 
			<p>Athensoft &copy;2018</p>
		</div>
		
	</body>
</html>
