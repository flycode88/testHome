<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">增加新信息</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>基本信息</span></div>
    <form action="${pageContext.request.contextPath }/addone.action" method="post" target="rightFrame">
    <ul class="forminfo">
    <li><label>标题</label><input name="t_title" type="text" class="dfinput" /><i></i></li>
    <li><label>用户</label><input name="t_user" type="text" class="dfinput" /><i></i></li>
    <li><label>籍贯</label><input name="site" type="text" class="dfinput" /><i></i></li>
    <li><label>发布时间</label><input name="t_time" type="text" class="dfinput" /><i></i></li>
    <li><label>是否审核</label><input name="audit" type="text" class="dfinput" /><i></i></li>
    <li><label>&nbsp;</label><input  type="submit" class="btn" value="确认保存"/ target="rightFrame"></li>
    </ul>
    
    </form>
    </div>


</body>

</html>
