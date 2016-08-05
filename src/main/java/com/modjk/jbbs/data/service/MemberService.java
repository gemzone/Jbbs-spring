package com.modjk.jbbs.data.service;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.modjk.jbbs.data.domain.Member;

/**
 * @author gemzone (admin@modjk.com)
 * @version 1.0
 */

@Service
public class MemberService 
{
	private static final Log log = LogFactory.getLog(MemberService.class);
	
	@Autowired
	MemberJpaRepository memberJpaRepository;
	

	@Transactional
	public long create()
	{
		// memberJpaRepository.create("asdasasc", "bdfdfbd", "q3rqwrwr", "dsbrfdfb", "dbfdfbdfbbfd");
		
		Member m = new Member();
		m.setMemberId(memberJpaRepository.count());
		m.setId("sdfsdfsD");
		m.setName("sdfsdfsdf");
		m.setEmail("sdfsdfsdfsd@asd.com");
		m.setComment("sdfsdfsdfsd");
		
		
		
		
		Member newMember = memberJpaRepository.save( m );
		System.out.println(newMember.getMemberId());
		
		
		int error = 0 / 0 ;
		
		return newMember.getMemberId();
	}
	
}