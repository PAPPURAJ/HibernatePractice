package io.github.pappuraj.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Answer ans=new Answer(13,"He is a programmer");
		session.save(new Question(12,"Who is Pappuraj", ans));
		session.save(ans);
		session.getTransaction().commit();
		
		Question question=session.get(Question.class, 12);
		System.out.println(question);

		session.close();
		sessionFactory.close();

	}

}
