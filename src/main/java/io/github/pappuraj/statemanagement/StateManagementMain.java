package io.github.pappuraj.statemanagement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateManagementMain {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = conf.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// Transient State
		Project2Morrow p2m = new Project2Morrow("Pappuraj", "Chittagong");
		session.save(p2m);
		p2m.setHomeTown("Raozan");
		System.out.println(session.get(Project2Morrow.class, 100));
		tx.commit();
		p2m.setHomeTown("Boalkhali");
		System.out.println(session.get(Project2Morrow.class, 100));

		session.close();
		sessionFactory.close();

	}

}
