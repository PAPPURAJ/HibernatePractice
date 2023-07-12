package io.github.pappuraj.Hibernate.NativeSQL;

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


    	NativeQuery c = session.createSQLQuery("SELECT * from services");

    	List<Object[]> ob= c.list();
    	
    	for(Object[] s:ob)
    		//System.out.println(Arrays.deepToString(s));
    		System.out.println(s[0]+" : "+s[1]);
    	
    	
    	
    	session.close();
    	
    	
    }
}
