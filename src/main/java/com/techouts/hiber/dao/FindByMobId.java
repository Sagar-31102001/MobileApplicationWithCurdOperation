package com.techouts.hiber.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.techouts.hiber.entity.Mobile;

public class FindByMobId 
{
	private SessionFactory sessionFact=HibernateConnection.getSessionFactory();
	
	public Mobile fetchById(Integer id)
	{
		try(Session session = sessionFact.openSession();) 
		{
			Mobile mobile = session.get(Mobile.class, id);
			
			if (mobile!=null)
			{
				 return mobile;
			}
			else 
			{
				return null;
			}
		} 
		catch (Exception e)
		{
			System.err.println(e.getMessage());
			
			return null;
		}
	}
}
