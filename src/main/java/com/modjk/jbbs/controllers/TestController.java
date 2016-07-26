package com.modjk.jbbs.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 *
 */
@Controller
public class TestController 
{
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping("/main")
	public String main(Model model)
	{
		model.addAttribute("msg", "test");
		
		return "main";
	}
	
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping("/test")
	public String test(Model model)
	{
		model.addAttribute("msg", "testadasd");
		return "test";
	}
	
	/**
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("/list")
	public String list(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response)
	{
		
		
		return "test";
		
	}
	
}
