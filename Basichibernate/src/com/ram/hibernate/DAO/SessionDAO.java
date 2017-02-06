package com.ram.hibernate.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ram.hibernate.account.Account;
import com.ram.hibernate.sessionutil.SessionUtil;

public class SessionDAO {
	
	
public void get(int ID){
	Session session=null;
	Account account=null;
	
	try{
		
		session=SessionUtil.getsession();
		account=session.get(Account.class, ID);
		session.save(account);
		                                 //ikkada return type andhuku vadali and 
		                                     //account account =null get lo ndhuku pettam and insert lo null andhuku pettaledhu//
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		
		session.close();
	}

	
	
	
	
}

public void Insert(Account account){
	
	Session session=null;
	try{
		session=SessionUtil.getsession();
		session.getTransaction().begin();
		session.getTransaction().commit();
		session.save(account);
		
	}catch(Exception e){
		
	e.printStackTrace();
	
	}finally{
		session.close();
	}
}

	public void update(Account account)
	{
		Session session=null;
		
		try{
			
			session=SessionUtil.getsession();
			
			session.getTransaction().begin();
			session.getTransaction().commit();
			session.update(account);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{session.close();
		
	}}
	
	public void delete(int ID){
		Session session=null;
		
		Transaction tx=null;
		try{
			session=SessionUtil.getsession();
			tx=session.beginTransaction();
			Account account=session.get(Account.class, ID);
			session.delete(account);
			tx.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			if(tx!=null)
			tx.rollback();
			
		}
		
		
	}
}




















