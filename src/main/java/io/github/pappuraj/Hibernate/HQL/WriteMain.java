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
public class WriteMain 
{
    public static void main( String[] args )
    {

    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	session.beginTransaction();
    	
    	//Query c = session.createQuery("from Services where id=:a and price=:b");
    	Query c = session.createQuery("delete from Services as s where s.id=:a");
    	
    	c.setParameter("a", 12);
    	c.executeUpdate();
    	
    	session.getTransaction().commit();
    
    	
    	
    	
    	
    	session.close();
    	factory.close();
    	
    	
    }
}
