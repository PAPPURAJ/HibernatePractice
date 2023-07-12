package io.github.pappuraj.hibernate.restriction;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
//		session.save(new Student(13,"Pappuraj","CSE"));
//		session.getTransaction().commit();
		
		
		Criteria criteria=session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("department", "CSE"));
		
		List<Student> list=criteria.list();
		
		for(Student s:list) {
			System.out.println(s);
		}
		
		session.close();
		sessionFactory.close();

	}

}
