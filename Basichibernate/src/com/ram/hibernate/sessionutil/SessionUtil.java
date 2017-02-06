package com.ram.hibernate.sessionutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
	
	private static SessionFactory factory;
	
	static{
		try{
			
			factory=new Configuration().configure("com/ram/hibernate/configuration/ram.cfg.xml").buildSessionFactory();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	private SessionUtil(){
		
	}
	public static Session getsession(){
		return factory.openSession();
		
	}
	
	
	

}
