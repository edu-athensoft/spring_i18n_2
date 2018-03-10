<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
					
					<li><a href="index_zh">å³äºæä»¬</a></li>
					<li><a href="#">æä»¬çäº§å</a></li>
					<li><a href="contact_zh">èç³»æä»¬</a></li>
					<li>
						è¯­è¨:<select id="lang" onchange="lanChanged(this)">
							  <option value ="en" >English</option>
						    <option value ="fr">FranÃ§ais</option>
						    <option value ="zh" selected="selected">ä¸­æ</option>
						</select>
					</li>
					
				</ul>
				
			</div>
			<div class="clr"></div>
		</div>
			<div id="main">
			<div class="form" id="form" >
					
					<form  action="test" method="get">
						 <p><input type="hidden" name="lang" value="zh"/></p>
						 <p>æ¨çåå­:&nbsp;<input type="text" name="name"/></p>
						 <p>çµå­é®ä»¶:&nbsp;&nbsp;<input type="email" name="email" /></p>
						 <p>åå®¹:<textarea name="text"></textarea></p>
						
						 <p><input type="submit" value="æäº¤"></p>
					</form>
				</div>
				
				<div class="clr"></div>
		</div>
		
		<div id="footer"> 
			<p>Athensoft &copy;2018</p>
		</div>
		
	</body>
</html>
