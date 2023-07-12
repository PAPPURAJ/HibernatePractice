package io.github.pappuraj.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMain {

	public static void main(String[] args) {
	
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Student s1=new Student(10,"Subro");
		s1.setTeacher(new Teacher(20,"Papry"));
		
		Student s2=new Student(11,"Bijoy");
		s2.setTeacher(new Teacher(21,"Farjana"));
		
		session.save(s1);
		//session.save(s2);
		
		
		Teacher t1=new Teacher(30,"Imran Masud");
		t1.setStudent(new Student(40,"Pappuraj"));
		Teacher t2=new Teacher(31,"Beauty Biswas");
		t2.setStudent(new Student(41,"Keya"));
		
		
		session.save(t1);
		//session.save(t2);
		
		tx.commit();
		
		
		System.out.println((Teacher)session.get(Teacher.class, 30));
		System.out.println((Student)session.get(Student.class, 10));
		
		session.close();
		sessionFactory.close();
		

	}

}
