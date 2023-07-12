package io.github.pappuraj.Hibernate.Session;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

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
    	Services s=session.get(Services.class, 0);
    	System.out.println(s);
    	session.close();
    	
    	Session session1=factory.openSession();
    	session1.beginTransaction();
    	Services s2=session1.get(Services.class, 0);
    	System.out.println(s2);
    	session1.close();
    	
    	factory.close();
    	
    	
    }
}
