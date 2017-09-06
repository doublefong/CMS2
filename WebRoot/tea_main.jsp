<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <table align="center"width="450"height="260"border="1">

    
<tr>
     <td align="center" colspan="2" height="40">
         <ul>
			<li><a href="action/teacher.jsp?method=teacher_list">教师信息</a></li>
			<%--在用户验证密码账号界面判断是学生还是教师在跳转各自的主页 --%>
		</ul>
      </td>
</tr>
<tr>
     <td align="center" colspan="2" height="40">
         <ul>
			<li><a href="action/teacher.jsp?method=course_list">课程信息</a></li>
			<%--在用户验证密码账号界面判断是学生还是教师在跳转各自的主页 --%>
		</ul>
      </td>
</tr>

</table>
  </body>
</html>
