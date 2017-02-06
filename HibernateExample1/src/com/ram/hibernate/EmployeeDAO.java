package com.ram.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {
	
	public void addEmployee(int id,String name,String designation,int salary){
		
		Configuration config=new Configuration();
		
		config.configure("hibernate.cfg.xml");
		SessionFactory session=config.buildSessionFactory();
		
		Session sess=session.openSession();
		
		Transaction ts=sess.beginTransaction();
		
		Employee emp=new Employee(id,name,designation,salary);
			
		sess.save(emp);
		ts.commit();
		System.out.println("employee added");
		
		session.close();
		sess.close();
	
			
			
		
		
		
		
		
		
	}
	
	
	

}
