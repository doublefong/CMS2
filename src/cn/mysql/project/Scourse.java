package cn.mysql.project;

public class Scourse {
	private int id;
	private int tea_score;
	private int stu_grade;
	private int course_no;
    private String title;
    private String tea_evaluation;
    public int getId() 
    {
    	return id;
    }
    public void setId(int id) {
    	this.id = id;
    }
    public int getTea_score() 
    {
    	return tea_score;
    }
    public void setTea_score(int tea_score)
    {
    	this.tea_score=tea_score;
    	
    }
    public int getStu_grade() 
    {
    	return stu_grade;
    }
    public void setStu_grade(int stu_grade)
    {
    	this.stu_grade=stu_grade;
    	
    }
    public int getCourse_no() 
   {
	return course_no;
   }
    public void setCourse_no(int course_no) 
    {
    	this.course_no = course_no;
    }

    public String getTitle()
    {
	return title;
    }
    public void setTitle(String title) 
    {
    	this.title = title;
    }
    public String getTea_evaluation()
{
	return tea_evaluation;
}

public void setTea_evaluation(String tea_evaluation)
{
	this.tea_evaluation= tea_evaluation;
}
}
