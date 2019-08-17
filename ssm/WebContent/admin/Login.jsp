<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
 String path = request.getContextPath();
 String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
   + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
 <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎登录后台管理系统</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>
<script src="js/cloud.js" type="text/javascript"></script>

<script language="javascript">
	$(function() {
		$('.loginbox').css({
			'position' : 'absolute',
			'left' : ($(window).width() - 692) / 2
		});
		$(window).resize(function() {
			$('.loginbox').css({
				'position' : 'absolute',
				'left' : ($(window).width() - 692) / 2
			});
		})
	});
	
	/*点击图片更换验证码事件*/
	 function changeImage() {
	      $('#verifyCodeImage').attr('src', '${pageContext.request.contextPath }/LoginControl/getVerifyCode);
	 }
	
</script>

</head>

<body
	style="background-color: #df7611; background-image: url(images/light.png); background-repeat: no-repeat; background-position: center top; overflow: hidden;">



	<div id="mainBody">
		<div id="cloud1" class="cloud"></div>
		<div id="cloud2" class="cloud"></div>
	</div>


	<div class="logintop">

		<span>欢迎登录后台管理界面平台</span>

	</div>

	<div class="loginbody">

		<span class="systemlogo"></span>

		
		<div class="loginbox loginbox1">
			<form action="Login.action" method="post" onsubmit="return check()">
				<ul>
					<p style="color: red">${msg }</p>
					<li><input id="username" name="username" type="text" class="loginuser"
						placeholder="用户名" /></li>
					<li><input id="password" name="password" type="password" class="loginpwd"
						placeholder="密码" /></li>
					<li class="yzm"><span><input id="verifyCode"  maxlength="4" name="verifyCode" type="text" value="验证码"  /></span>
					<cite><img src="${pageContext.request.contextPath}/LoginControl/getVerifyCode" id="verifyCodeImage" onclick="javascript:changeImage();">	</cite>
					</li>
					<li><input name="" type="submit" class="loginbtn" value="登录"
							href="admin/reg.jsp">注册</a></label><label><a href="#">忘记密码？</a></label></li>
				</ul>
			</form>

		</div>

	</div>


	


</body>

</html>
