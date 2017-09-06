package com.cn.javabean;
import java.io.UnsupportedEncodingException;
public class CharactorEncoding {
public CharactorEncoding()
{	}
public String toString(String str) throws UnsupportedEncodingException
{
	String text="";
	text=new String(str.getBytes("ISO-8859-1"),"UTF-8");
	return text;
}
}
