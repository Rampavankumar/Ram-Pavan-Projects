package com.ram.service;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ram.bean.Account;
import com.ram.util.Sessionutil;

public class AccountDAO {

	public Account get(String accno) {
		Session session = null;                //once verify this program and why we are unable to use configu
		                                           //object and why we are using in previous program in hibernate//
		Account account = null;
		try {
			session =Sessionutil.getSession();
			account = (Account) session.get(Account.class, accno);
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			//session.close();
		}
		return account;
	}

	public void insert(Account account){
		Session session=null;
		try{
			session = Sessionutil.getSession();
			session.getTransaction().begin();
			session.save(account);
			session.getTransaction().commit();
			}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			Sessionutil.closeSession(session);
		}
	}
	
	
	public void update(Account account){
		
		Session session=null;
		try{
			session=Sessionutil.getSession();
			session.getTransaction().begin();
			session.update(account);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			Sessionutil.closeSession(session);
		}
		
	}
	
public void delete(String accno){
	Session session = null;
	
	Transaction transaction =null;
	
	try{
		session =Sessionutil.getSession();
		transaction =session.beginTransaction();
		Account account = (Account)session.get(Account.class, accno);
		session.delete(account);
		transaction.commit();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		Sessionutil.closeSession(session);
	}
	
}
	
}
