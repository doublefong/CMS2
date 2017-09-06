package cn.mysql.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Student {
	private int id;
	private String name;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
public void modify(int id,String name,String password){
		
		Configuration cfg=new Configuration().configure();
		
		ServiceRegistry sr = new StandardServiceRegistryBuilder()
								.applySettings(cfg.getProperties())
								.build();
		SessionFactory sf = cfg.buildSessionFactory(sr);

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Student user = new Student();
		user.setId(id);
		user.setName(name);
		user.setPassword(password);
		session.save(user);
		tx.commit();
		session.close();
	}
public boolean valid(int Id,String password)
{
	boolean valid=false;
	Configuration cfg=new Configuration().configure();

	ServiceRegistry sr = new StandardServiceRegistryBuilder()
							.applySettings(cfg.getProperties())
							.build();
	SessionFactory sf = cfg.buildSessionFactory(sr);
	Session session = sf.openSession();
	Student user=(Student)session.get(Student.class,new Integer(Id));
	System.out.print(user.getPassword());
	if(password.equals(user.getPassword()))
	valid=true;
	else
		valid=false;
	session.close();
return valid;
}
	
}
