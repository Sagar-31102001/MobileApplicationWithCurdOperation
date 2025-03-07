package com.techouts.hiber.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnection
{
	private static SessionFactory sessionFact=null;
	
	private HibernateConnection()
	{
		super();
	}
	
	static {
		
		try
		{
			sessionFact = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		} 
		catch (Exception e)
		{
			System.err.println("Hibernate Connection Faild...");
		}
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFact;
	}
}
