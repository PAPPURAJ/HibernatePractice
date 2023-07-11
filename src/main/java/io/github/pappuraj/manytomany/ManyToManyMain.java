package io.github.pappuraj.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyMain {

	public static void main(String[] args) {

		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(10,"Raj",null));
		studentList.add(new Student(11,"Keya",null));
		studentList.add(new Student(12,"Shayeri",null));
		
		
		List<Course> courseList=new ArrayList<Course>();
		courseList.add(new Course(20,"Data structure",null));
		courseList.add(new Course(21,"Algorithm",null));
		courseList.add(new Course(22,"Java",null));
		
		session.save(new Student(30,"Subro",courseList));
		session.save(new Course(40,"Java",studentList));
		
		session.getTransaction().commit();
		
		
		System.out.println((Student)session.get(Student.class, 30));
		
		
		
		session.close();
		sessionFactory.close();
		
		
	}

}
