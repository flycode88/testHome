<%@page import="com.po.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript">
$(function(){	
	//顶部导航切换
	$(".nav li a").click(function(){
		$(".nav li a.selected").removeClass("selected")
		$(this).addClass("selected");
	})	
	//退出功能
	$("#out").click(function(){
		var flag=window.confirm("你真的要退出吗?");
		if(flag){
			window.top.location.href="Login.jsp";
		}
	})
	
})	
</script>


</head>

<body style="background: url(${pageContext.request.contextPath }/images/topbg.gif) repeat-x;">
	<div class="topleft">
		<a href="${pageContext.request.contextPath }/admin/error.jsp" target="_parent"><img
			src="${pageContext.request.contextPath }/images/logo.png" title="系统首页" /></a>
	</div>


	<div class="topright">
		<ul>
			<li><a href="JavaScript:void(0)" id="out">退出</a></li>
		</ul>

		<div class="user">
			<span>${login.username}</span>
		</div>

	</div>
</body>
</html>
