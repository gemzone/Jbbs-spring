package com.modjk.jbbs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController 
{
	@RequestMapping("/main")
	public String main(Model model)
	{
		model.addAttribute("msg", "test");
		
		return "main";
	}
	
	@RequestMapping("/test")
	public String test(Model model)
	{
		model.addAttribute("msg", "testadasd");
		return "test";
	}
}
