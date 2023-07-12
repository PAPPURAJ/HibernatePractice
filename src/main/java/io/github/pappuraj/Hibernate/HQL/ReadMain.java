package io.github.pappuraj.Hibernate.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class ReadMain 
{
    public static void main( String[] args )
    {

    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	session.beginTransaction();
    	
    	session.save(new Services("Money Ld","300000"));
    	session.getTransaction().commit();
    	
    	//Query c = session.createQuery("from Services where id=:a and price=:b");
    	Query c = session.createQuery("from Services as s where s.id=:a and s.price=:b");
    	c.setParameter("a", 0);
    	c.setParameter("b", "300000");
    	List<Services> list=c.list();
    	for(Services s:list)System.out.println(s);
    	
    	
    	
    	session.close();
    	
    	
    }
}
