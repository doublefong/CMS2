<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="cn.mysql.project.*"%>
<%
String name = request.getParameter("name");
String password = request.getParameter("password");
String id=request.getParameter("id");
int Id=Integer.valueOf(id).intValue(); 
// 验证登录
if(Id<5)
{
admin account=new admin();
boolean valid=account.valid(Id, password);
if(valid)
{
	response.sendRedirect("../admin.jsp");
}
else
{
	response.sendRedirect("../index.jsp");	
}
}
else if(Id<10)
{
	teacher account=new teacher();
	boolean valid=account.valid(Id, password);
	if(valid)
	{
		response.sendRedirect("../tea_main.jsp");
	}
	else
	{
		response.sendRedirect("../index.jsp");	
	}	
}
else
{
	Student account=new Student();
	boolean valid=account.valid(Id, password);
	if(valid)
	{
		response.sendRedirect("../stu_main.jsp");
	}
	else
	{
		response.sendRedirect("../index.jsp");	
	}	
}
%>


