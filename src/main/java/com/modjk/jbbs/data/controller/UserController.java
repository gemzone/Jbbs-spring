package com.modjk.jbbs.data.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.modjk.jbbs.data.domain.User;
import com.modjk.jbbs.data.service.UserJpaRepository;
import com.modjk.jbbs.data.service.UserService;

/**
 * @author gemzone
 *
 */
@Controller
public class UserController 
{
	@Autowired
	UserService userService;
	
	
//	@ResponseBody
//	@RequestMapping(path="/member/login", produces="text/json")
//	public String login(Model model, HttpSession session)
//	{
////		User user = session.getAttribute("user");
////		model.addAttribute("user", id);
//		return "login";
//	}
	
	@ResponseBody
	@RequestMapping(path="/test/create", produces="text/json")
	public String create(Model model, HttpSession session)
	{
		
	//	userService.createUser();
		
		
		
//		User user = userJpaRepository.findByName("sdfsdfsdf");
//		
//		
//		System.out.println(user.getName());
//		
//		
//		
//		
//		
//		userJpaRepository.create("asdf", "bserb", "123123", "ageewg", "nrtrtnrtn");
//		
		
//		User user = session.getAttribute("user");
//		model.addAttribute("user", id);
		return "login";
	}
	
	
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST )
	public ModelAndView loginProcess(@RequestParam("user_id") String id,
			@RequestParam("user_password") String password,
			Model model, 
			HttpSession session)
	{
		ModelAndView mv = new ModelAndView();
//		
//		User member = memberRepository.login(id, password);
//		sessionUpdate(session, member);
//		
//		if( member == null ) 
//		{
//			mv.setViewName("redirect:/login?f=1");	// fail true
//		}
//		else
//		{
//			mv.setViewName("redirect:/login");
//		}
		return mv;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(Model model, HttpSession session)
	{
		ModelAndView mv = new ModelAndView();
		session.invalidate();
		mv.setViewName("redirect:/login");
		return mv;
	}
	
	public void sessionUpdate(HttpSession session, User member)
	{
		if( member != null ) 
		{
//			session.setAttribute("user_id", user.getUserId());
//			session.setAttribute("id", user.getId());
//			session.setAttribute("name", user.getName());
		}
	}
	
	public void sessionRemove(HttpSession session)
	{
		session.invalidate();
	}
	
	
	// 
//	@RequestMapping("/users")
//	public String list(Model model)
//	{
//		List<User> list = userRepository.findAll();
//		for( User u : list )
//		{
//			System.out.println(u.name);
//			System.out.println(u.id);
//		}
//		model.addAttribute("users", list);
//		User list2 = userRepository.findByName("name");
//		model.addAttribute("users2", list2);
//		
//		return "test2";
//	}
//	
//	
//	@RequestMapping("/userList")
//	public String list(Model model)
//	{
//		List<User> list = userRepository.findAll();
//		for( User u : list )
//		{
//			System.out.println(u.name);
//			System.out.println(u.id);
//		}
//		model.addAttribute("users", list);
//		User list2 = userRepository.findByName("name");
//		model.addAttribute("users2", list2);
//		
//		return "test2";
//	}
//	
	
	
//	
//	/**
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping("/test2")
//	public String view(Model model)
//	{
//		
////		Configuration configuration = new Configuration();
////        configuration.configure();
////        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
////
////        SessionFactory sf = configuration.buildSessionFactory(sr);
////
////        
//        
////		List<User> list = userRepository.findAll();
////		for( User u : list )
////		{
////			System.out.println(u.name);
////			System.out.println(u.id);
////		}
////		model.addAttribute("users", list);
////		User list2 = userRepository.findByName("name");
////		model.addAttribute("users2", list2);
//
////        Session ss = sf.openSession();
////        ss.beginTransaction();
////        
////		JnkUserHome jnkUserHome = new JnkUserHome();
////		JnkUser user = jnkUserHome.findById(1);
////		ss.getTransaction().commit();
////		ss.close();
////		System.out.println( user.getName() );
////		
//		return "test2";
//	}
	
//	
//	@ModelAttribute("users")
//	public List<User> users(Model model)
//	{
//		List<User> list = userRepository.findAll();
//		
//		return list;
//	}
	
	
//	 @RequestMapping("/")
//   public String redirect() {
//         return "redirect:/query?q=Thymeleaf Is Great!";
//   }
	
}




//@Controller
//public class TestController 
//{
//	/**
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping("/main")
//	public String main(Model model)
//	{
//		model.addAttribute("msg", "test");
//		
//		return "main";
//	}
//	
//	/**
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping("/test")
//	public String test(Model model)
//	{
//		model.addAttribute("msg", "testadasd");
//		return "test";
//	}
//	
//	/**
//	 * @param model
//	 * @param session
//	 * @return
//	 */
//	@RequestMapping("/list")
//	public String list(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response)
//	{
//		
//		
//		return "test";
//		
//	}
//	
//}

