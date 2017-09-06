package cn.mysql.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class admin {
	private int adm_id;

	private String password;
	public int getAdm_id() {
		return adm_id;
	}
	public void setAdm_id(int adm_id) {
		this.adm_id = adm_id;
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

	     admin user = new admin();
		user.setAdm_id(id);
	
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
	admin user=(admin)session.get(admin.class,new Integer(Id));
	System.out.print(user.getPassword());
	if(password.equals(user.getPassword()))
	valid=true;
	else
		valid=false;
	session.close();
return valid;
}
	
}