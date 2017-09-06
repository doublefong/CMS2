package com.cn.javabean;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class DateBean {
	
	private String dateTime;
private String week;
private Calendar calendar=Calendar.getInstance();
public String getDateTime()
{
	Date currDate=Calendar.getInstance().getTime();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
	dateTime=sdf.format(currDate);//�������ڼ�ʱ����ַ�
	return dateTime;

}

public String getWeek()
{
String[]weeks={"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
int index=calendar.get(Calendar.DAY_OF_WEEK);

week=weeks[index-1];
return week;
}
}
