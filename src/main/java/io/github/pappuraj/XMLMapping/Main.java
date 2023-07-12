package io.github.pappuraj.XMLMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(new Student(12,"Pappuraj","CSE"));
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();

	}

}
