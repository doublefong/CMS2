<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tea_evaluation.jsp' starting page</title>
    
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
 <jsp:useBean id="stu_course" class="cn.mysql.project.Scourse"></jsp:useBean>

 <jsp:setProperty name="stu_course" property="tea_score" ></jsp:setProperty>
 <jsp:setProperty name="stu_course" property="tea_evaluation" ></jsp:setProperty>
 <br>


 教评内容： <jsp:getProperty property="tea_evaluation" name="stu_course"/>


 <br></br>
 教评分数:<jsp:getProperty property="tea_score" name="stu_course"/>


  </body>
</html>
