package io.github.pappuraj.HibernatePractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	session.beginTransaction();
    	
    	session.save(new Services(112,"Money Ld","300000"));
    	session.getTransaction().commit();
    	
    	session.close();
    	
    	
        System.out.println( factory.isOpen() );
    }
}
