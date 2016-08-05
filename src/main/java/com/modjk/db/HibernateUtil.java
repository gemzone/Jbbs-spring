package com.modjk.db;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
 


public class HibernateUtil
{
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	  
	static 
	{
		try
		{
			Configuration configuration = new Configuration().configure();
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
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
