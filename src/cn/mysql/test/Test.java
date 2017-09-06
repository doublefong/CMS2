package cn.mysql.test;
import cn.mysql.project.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class Test {
	public static void main(String[] args){
		//1.�½�Configuration����
		//Ĭ�϶�ȡsrc�µ�hibernate.cfg.xml
		Configuration cfg=new Configuration().configure();
		//���hibernate�ĺ��������ļ�����hibernate.cfg.xml
		//Configuration cfg1 = new Configuration().configure("hb.cfg.xml");
		//�ɱ�̿��Բ�ʹ�������ļ�
		//cfg.addProperties();
		//cfg.addResource();
		//2.ͨ��Configuration����SessionFactory����
			//��hibernate3�����д��
			//SessionFactory sf=cfg.buildSessionFactory();
			//hibernate4.3֮ǰ��hibernate4.0֮��
			//ServiceRegistry sr = new ServiceRegistryBuilder()
			//						   .applySetting(cfg.getProperties())
			//						   .buildServiceRegistry();
		ServiceRegistry sr = new StandardServiceRegistryBuilder()
								.applySettings(cfg.getProperties())
								.build();
		SessionFactory sf = cfg.buildSessionFactory(sr);
		//SessionFactory���̰߳�ȫ��
		//3.ͨ��SessionFactory�õ�Session
		Session session = sf.openSession();
		//4.ͨ��Session����õ�Transaction����
		Transaction tx = session.beginTransaction();
		//5.�������
		User user = new User();
		user.setId(00);
		user.setName("С");
		user.setPassword("MM");
		session.save(user);
		//session����������Ϊ��jdbc�е�connection��һ����װ
		//6.�ύ����
		tx.commit();
		//7.�ر�Session
		session.close();
	}
}
