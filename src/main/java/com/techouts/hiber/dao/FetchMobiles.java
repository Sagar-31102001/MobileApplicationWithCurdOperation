package com.techouts.hiber.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.techouts.hiber.entity.Mobile;

public class FetchMobiles 
{
	private SessionFactory sessionFact=HibernateConnection.getSessionFactory();
	
	public List<Mobile> fetchMobile()
	{
		List<Mobile> mobList=null;
		
		try(Session session = sessionFact.openSession();)
		{
			String hqlQuery="FROM Mobile";
			
			Query<Mobile> query = session.createQuery(hqlQuery, Mobile.class);
			mobList=query.getResultList();
			
			return mobList;
		}
		catch (Exception e)
		{
			return null;
		}
	}
}
