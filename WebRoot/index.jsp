<%@ page language="java" import="java.util.*,com.cn.javabean.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登陆</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  </head>
  
     <body >
     <jsp:useBean id="date" class="com.cn.javabean.DateBean" scope="application"></jsp:useBean>
	<div align="center">
	<div id="clock">
	    <div id="time">
	    <jsp:getProperty property="dateTime" name="date"/>
	    </div>
	    <div id=week>
	    <jsp:getProperty property="week" name="date"/>
	    </div>
	</div>
	</div>
<!--显示时间-->
					<center>
				<form name="form1" action="action/login.jsp" method="post">
				<table>
			
					<tr>
						<td>账号：</td>
				<td><input type="text" name="id"size="20"></td>
					</tr>
					<tr>
						<td>密码：</td>
						<td><input type="password" name="password"size="21" ></td>
					</tr>
					<tr>
					</tr>
					<tr>
						<td> <input type="submit" name="submit" value="登录">
					<td><input type="reset" name="reset" value="重置">
					 &nbsp;&nbsp;<input type="button" name="close" value="关闭" onclick="window.close()"/>
				&nbsp;&nbsp;<a href="reset.jsp">忘记密码</a>     </td>
					</tr>
						
				</table>
				</form>
				</center>
				
			
      </body>
</html>
