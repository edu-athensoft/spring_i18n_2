<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
		<div id="english">
		<div id="header">
			
			<h1>Athensoft </h1>
			
			<div id="navi">
				
			<ul >
					<li><a href="index">About us</a></li>
					<li><a href="product_en">Our Products</a></li>
					<li><a href="contact_en">Contact us</a></li>
					<li>
						language:<select id="lang" name="lang" onchange="lanChanged(this)">
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
				<p> Thanks, we will contact with you soon!</p>
				
				<div class="clr"></div>
		</div>
		
		<div id="footer"> 
			<p>Athensoft &copy;2018</p>
		</div>
		</div>
		<div class="Chinese">
		<div id="header">
			
			<h1>Athensoft </h1>
			
			<div id="navi">
				
				<ul >
					<li><a href="index_zh">å³äºæä»¬</a></li>
					<li><a href="product_zh">æä»¬çäº§å</a></li>
					<li><a href="contact_zh">èç³»æä»¬</a></li>
					<li>
						è¯­è¨:
							<select id="lang" onchange="lanChanged(this)">
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
				<p> æä»¬ä¼å°½å¿«èç³»æ¨ï¼è°¢è°¢</p>
				
				<div class="clr"></div>
		</div>
		
		<div id="footer"> 
			<p>Athensoft &copy;2018</p>
		</div>
		</div>
		
	</body>
	<script type="text/javascript">
			
			var language=window.location.href.split("=")[1];
			 language=language.split("&")[0];
			
			switch (language){
				case "zh":
				$("#english").css('display','none');
				$("div.Chinese").css('display','block');
					break;
				case "en":
				$("#english").css('display','block');
				$("div.Chinese").css('display','none');
					break;
				case "fr":
				
					break;
				default:
					break;
			}	
			
		</script>
</html>
