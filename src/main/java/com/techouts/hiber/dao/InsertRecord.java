package com.techouts.hiber.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.techouts.hiber.entity.Mobile;

public class InsertRecord 
{
	private SessionFactory sessionFact=HibernateConnection.getSessionFactory();
	
	public String insertRecord(Mobile mobile)
	{
		Transaction tx=null;
		try(Session session = sessionFact.openSession();)
		{
			tx = session.beginTransaction();
			
			session.persist(mobile);
			
			tx.commit();
			
			return "Mobile Record Insert Sucessfully With Id : "+mobile.getMobile_Id();
			
		}
		catch (Exception e) 
		{
			if (tx!=null)
			{
				tx.rollback();
				return "Mobile Record Insertion Faild...";
			} 
			else
			{
				return "Session Can not able to create...!!!";
			}
		}
	}
}
