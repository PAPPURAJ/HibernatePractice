package io.github.pappuraj.HibernatePractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.imageio.stream.FileImageInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {

    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	session.beginTransaction();
    	
    	
    	FileInputStream fs=new FileInputStream("src/main/java/myimage.jpg");
    	byte[] data=new byte[fs.available()];
    	fs.read(data);
    	 
    	
    	
    	
    	//session.save(new Services("Money Ld","300000"));
    	session.save(new EmployeeList("Pappuraj","01832755401",new Date(),data,new Services("Money Ld","300000")));
    	session.getTransaction().commit();
    	
    	System.out.println((EmployeeList)session.get(EmployeeList.class, 0));
    	
    	session.close();
    	
    	
        System.out.println( factory.isOpen() );
    }
}
