package com.ram.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Sessionutil {
	
private static SessionFactory sessionFactory;

static{
	
	try{
		sessionFactory=new Configuration().configure("com/ram/hibernate/bean/hibernate.cfg.xml").buildSessionFactory();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
}

private Sessionutil(){


}
public static Session getSession() {
	return sessionFactory.openSession();

}
public static void closeSession(Session session) {
	if (session != null) {
		session.close();



}
}
}

	/*private static SessionFactory sessionFactory;

	static {
		try {
			
			 sessionFactory =  new Configuration().configure("com/naresh/hibernate/config/hibernate.cfg.xml").buildSessionFactory();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Sessionutil() {

	}

	public static Session getSession() {
		return sessionFactory.openSession();
	}

	public static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}
}
*/