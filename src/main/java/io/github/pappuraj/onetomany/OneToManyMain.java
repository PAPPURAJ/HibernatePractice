package io.github.pappuraj.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyMain {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=conf.buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(new Answer(20,"He is a programmer"));
		list.add(new Answer(21,"His hometown in chittagong"));
		list.add(new Answer(22,"Graduated from DUET"));
		
		for(Answer ans:list) session.save(ans);
		
		session.save(new Question(15,"Who is pappuraj?",list));
		//session.save(list);
		
		session.getTransaction().commit(); 
		
		Question question=session.get(Question.class, 15);
		for(Answer ans:question.getList())
			System.out.println(ans);
		
		session.close();
		sessionFactory.close();

	}

}
