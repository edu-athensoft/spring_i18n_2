<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt"%>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<c:set var="loc" value="en_US"/>
<c:if test="${!(empty param.lang)}" >
  <c:set var="loc" value="${param.lang}"/>
</c:if>

<fmt:setLocale value="${loc}" />
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
					<li><a href="index"><spring:message code="aboutus"/></a></li>
					<li><a href="#">	 <spring:message code="ourproducts"/></a></li>
					<li><a href="contact_en?lang=en_US">	 <spring:message code="contactus"/></a></li>
					<li>
					<li>
					<spring:message code="language"/>:
						<select id="selectLang"  onchange="changeLang(this)">
						 <option value ="#" >--- choose a language ---</option>
							  <option value ="en_US" >English</option>
						   <option value ="fr_CA">Français</option>
						    <option value ="zh_CN" >中文</option>
						</select>
					</li>
					
				</ul>
				
			</div>
			<div class="clr"></div>
		</div>
			<div id="main">
			<p>
			<spring:message code="ourproducts"/>
				</p>
			
			
		</div>
		
		<div id="footer"> 
			<p>Athensoft &copy;2018</p>
		</div>
		
		<script>
		$(document).ready(function(){
			var initLoc = "${loc}";
			alert("page just loaded in "+initLoc);
			$("#selectLang").val(initLoc);
		})

		</script>
		
	</body>
</html>
