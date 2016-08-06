package com.modjk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.modjk.jbbs.data.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JbbsSpringApplication.class)
@WebAppConfiguration
public class JbbsSpringApplicationTests implements CommandLineRunner
{
	@Autowired
	UserService userService;
	
	@Test
	public void contextLoads()
	{
		System.out.println("contextLoads");
		
	//	System.out.println( userService.getIdentity() );
		
		userService.addUser("asdfasdf", "asdvasdv", "asdfsadf","sdfabsfdb", "asdbasbdsdab");
		
//		
//		
//		Member m = new Member();
//		m.setMemberId(memberRepository.count());
//		m.setId("sdfsdfsD");
//		m.setName("sdfsdfsdf");
//		m.setEmail("sdfsdfsdfsd@asd.com");
//		m.setComment("sdfsdfsdfsd");
//		
//		
//		memberHome.remove( m );
//		
		
		
//		{
//			Session session = HibernateUtil.getSessionFactory().openSession();
//			Transaction transaction = session.getTransaction();
//			transaction .begin();
//			
//			
//
//			SQLQuery query = session.createSQLQuery("SELECT TOP 1 member_id FROM [dbo].[member] WHERE name = :name");
//			
//			
//			List<Member> list = query.list();
//			
//			for( Member m : list )
//			{
//				System.out.println( m.getName() );
//				
//			}
//			
//			
//
//			transaction.commit();
//			
//			session.close();
//			sessionFactory.close();
//		}
//		
		
		
		
		
		
		// memberRepository.create("test1", "123123", "nametest", "emailtest", "commenttest");
		
		
		
		// repository를 통한 방법
		
//		Member m = new Member();
//		m.setMemberId(memberRepository.count());
//		m.setId("sdfsdfsD");
//		m.setName("sdfsdfsdf");
//		m.setEmail("sdfsdfsdfsd@asd.com");
//		m.setComment("sdfsdfsdfsd");
//		memberRepository.save(m);
		
		
		
		
		
		
		
	}

	@Override
	public void run(String... arg0) throws Exception
	{
		// TODO Auto-generated method stub
		
		System.out.print("run");
	}
}
