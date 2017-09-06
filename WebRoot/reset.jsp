<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
					<center>
				<form name="form1" action="message.html" method="post">
				<table>
			
					<tr>
						<td>账号：</td>
						<td><input type="text" name="username"size="20" maxlength="20"></td>
					</tr>
					<tr>
						<td>姓名：</td>
						<td><input type="password" name="password" size="20"></td>
					</tr>
					<tr>
					</tr>
					<tr>
						<td> <input type="submit" name="submit" value="重置密码"></td>
					</tr>
						
				</table>
				</form>
				</center>
				
			
      </body>
</html>