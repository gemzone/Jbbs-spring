package com.modjk.jbbs.data.service;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.modjk.db.HibernateUtil;

/**
 * @author gemzone (admin@modjk.com)
 * @version 1.0
 */

@Component
public class UserService
{
	private static final Log log = LogFactory.getLog(UserService.class);
	
	@Autowired
	UserJpaRepository userJpaRepository;
	
//	Page<City> findCities(CitySearchCriteria criteria, Pageable pageable);
//
//	City getCity(String name, String country);
//
//	Page<HotelSummary> getHotels(City city, Pageable pageable);
	
	public void addUser(String id, String password, String name, String email, String comment)
	{
		Long newIdentity = userJpaRepository.getNewIdentity();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		
		try
		{
			String sql = "INSERT INTO [dbo].[user] ([user_id], [group_id], [id], [password_sha2_512], [password_sha3], [name], [email], [level], [point], [comment], [is_superadmin]) "   
					+ "VALUES (:newIdentity, 0, :id ,HASHBYTES('SHA2_512' , :password ), NULL, :name, :email, 9, 0, :comment, 0) ";
			Query query = session.createSQLQuery(sql);
			
			query.setParameter("newIdentity", newIdentity);
			query.setParameter("id", id);
			query.setParameter("password", password);
			query.setParameter("name", name);
			query.setParameter("email", email);
			query.setParameter("comment", comment);
			query.executeUpdate();
			
			
		//	int a = 0 / 0 ;
			
			transaction.commit();
		}
		catch(Exception e)
		{
			transaction.rollback();
		}
	}
	
//	
//	private final UserJpaRepository userJpaRepository;
//
//
//	public UserServiceImpl(UserJpaRepository userJpaRepository) 
//	{
//		this.userJpaRepository = userJpaRepository;
//	}
//	
//	@Transactional
//	public long createUser()
//	{
//		// memberJpaRepository.create("asdasasc", "bdfdfbd", "q3rqwrwr", "dsbrfdfb", "dbfdfbdfbbfd");
//		
//		
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction transaction = session.getTransaction();
//		try 
//		{
//			transaction.begin();
//			
//			
//			
////			
////			String sql = "SELECT (ISNULL(MAX([user_id]), 0) + 1) AS [user_id] FROM [dbo].[user]";
////			Query query = session.createSQLQuery(sql);
////			
////			System.out.println( "sadfasdfs" + query.getQueryString() () );
////			
////			
//			
//			//query.executeUpdate();
//			
//			transaction.commit();
//		}
//		catch(Exception e)
//		{
//			transaction.rollback();
//			log.error(e.getMessage());
//		}
//		finally
//		{
//			session.close();
//		}
//		
////		
////		
////		
////		INSERT INTO [dbo].[user] ([user_id], [group_id], [id], [password_sha2_512], [password_sha3], [name], [email], [level], [point], [comment], [is_superadmin])  
////		VALUES ((SELECT (ISNULL(MAX([user_id]), 0) + 1) FROM [dbo].[user]), 0, :id ,HASHBYTES('SHA2_512' , :password ), NULL, :name, :email, 9, 0, :comment, 0) 
////		
////		
//		
//		
////		
////		entityManager.createNativeQuery( ).setParameter(arg0, arg1);
////		
////		query.
//		
////		Session session = HibernateUtil.getSessionFactory().openSession();
////        session.beginTransaction();
////		
////        try
////        {
////            //Update record using named query
////            Query query = session. (DepartmentEntity.UPDATE_DEPARTMENT_BY_ID)
////                                        .setInteger("id", 1)
////                                        .setString("name", "Finance");
////            query.executeUpdate();
////             
////            //Get named query instance
////            query = session.getNamedQuery(DepartmentEntity.GET_DEPARTMENT_BY_ID)
////                                        .setInteger("id", 1);
////            //Get all departments (instances of DepartmentEntity)
////            DepartmentEntity department = (DepartmentEntity) query.uniqueResult();
////            System.out.println(department.getName());
////            
////            
////            
////        }
////        finally
////        {
////            session.getTransaction().commit();
////            session.close();
////        }
////        
////        
////
////		@Query(value = "INSERT INTO [dbo].[user] ([user_id], [group_id], [id], [password_sha2_512], [password_sha3], [name], [email], [level], [point], [comment], [is_superadmin]) " 
////				+ "VALUES ((SELECT (ISNULL(MAX([user_id]), 0) + 1) FROM [dbo].[user]), 0, :id ,HASHBYTES('SHA2_512' , :password ), NULL, :name, :email, 9, 0, :comment, 0) "
////				+ "SELECT TOP 1 * FROM [dbo].[user] WHERE [user_id] = (SELECT (ISNULL(MAX([user_id]), 0) ) FROM [dbo].[user]) ", 
////				nativeQuery = true )
////		public User create(@Param("id") String id,
////				@Param("password") String password,
////				@Param("name") String name,
////				@Param("email") String email,
////				@Param("comment") String comment);
////		
//		
//		
//		
//		
////		
////		User m = new User();
////		m.setUserId(123);
////		m.setId("sdfsdfsD");
////		m.setName("sdfsdfsdf");
////		m.setEmail("sdfsdfsdfsd@asd.com");
////		m.setComment("sdfsdfsdfsd");
////		
////		User newUser = userJpaRepository.save( m );
////		// System.out.println(newMember.getMemberId());
////		
////		// int error = 0 / 0 ;
//		
//		// return newUser.getUserId();
//		return 1L;
//	}

	

	
}