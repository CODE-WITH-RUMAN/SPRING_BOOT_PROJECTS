package com.webapp.firstweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@Controller
public class WebController {
	
	@Autowired
	private Service service;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	
	/*
	 * @RequestMapping("/signup") public String login() { return "login"; }
	 */
	
	@RequestMapping("/profile")
	public String profile()
	{
		return "profile";
	}
	
	@RequestMapping("/savedata")
	public String savedata( Employee employee) 
	{
		/* System.out.println(employee.getPassword()); */
		return "redirect:/login";
	}
}
