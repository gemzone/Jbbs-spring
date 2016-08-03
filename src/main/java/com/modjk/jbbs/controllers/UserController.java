package com.modjk.jbbs.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.modjk.jbbs.data.User;
import com.modjk.jbbs.data.UserRepository;

/**
 * @author gemzone
 *
 */
@Controller
public class UserController 
{
	@Autowired
	public UserRepository userRepository;
	
	@RequestMapping("/login")
	public String login(Model model, HttpSession session)
	{
		String id = session.getAttribute("id") == null ? (String) session.getAttribute("id") : "";
		model.addAttribute("id", id);
		return "login";
	}
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST )
	public ModelAndView loginProcess(@RequestParam("user_id") String id,
			@RequestParam("user_password") String password,
			Model model, HttpSession session)
	{
		ModelAndView mv = new ModelAndView();
		
		System.out.println(id);
		System.out.println(password);
		
		if( "123".equals(password) )
		{
			session.setAttribute("id", id);
		}
		else
		{
			
		}
		mv.setViewName("redirect:/login");
		return mv;
	}
	

	
	@RequestMapping("/logout")
	public ModelAndView loginProcess(Model model, HttpSession session)
	{
		ModelAndView mv = new ModelAndView();
		session.invalidate();
		mv.setViewName("redirect:/login");
		return mv;
	}
	
	
	
	/**
	 * @param model
	 * @return
	 */
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
		User list2 = userRepository.findByName("name");
		model.addAttribute("users2", list2);
		
		return "test2";
	}
	
	
	@ModelAttribute("users")
	public List<User> users(Model model)
	{
		List<User> list = userRepository.findAll();
		
		return list;
	}
	
	
//	 @RequestMapping("/")
//   public String redirect() {
//         return "redirect:/query?q=Thymeleaf Is Great!";
//   }
	
}
