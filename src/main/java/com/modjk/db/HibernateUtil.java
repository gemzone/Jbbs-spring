package com.modjk.db;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateUtil
{
	private static SessionFactory sessionFactory;
	  
	static 
	{
		try
		{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} 
		catch (HibernateException e)
		{
			e.printStackTrace();
		}
	}
	  
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
