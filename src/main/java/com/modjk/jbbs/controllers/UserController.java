/**
 * @author Jung Seong Hun
 *
 */
package com.modjk.jbbs.controllers;



import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.modjk.jbbs.data.User;
import com.modjk.jbbs.data.UserRepository;
 
@Controller
public class UserController 
{

	@Autowired
	public UserRepository userRepository;
 
	@RequestMapping("/test2")
	public String view(Model model)
	{
		List<User> list = userRepository.findAll();
		
		for( User u : list )
		{
			System.out.println(u.name);
			System.out.println(u.id);
		}
		
		model.addAttribute("users", list);
		
		List<User> list2 = userRepository.findByNameEndsWith("abc");
		
		model.addAttribute("users2", list2);

		
		return "test2";
	}
	
	
	
	
	
	

//
//	@ModelAttribute("users")
//	public List<User> view(Model model)
//	{
//		List<User> list = userRepository.findAll();
//		
//		return list;
//		
//	}
//	
		
	
	
	
}
