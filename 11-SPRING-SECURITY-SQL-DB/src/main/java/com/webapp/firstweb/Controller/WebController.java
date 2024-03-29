package com.webapp.firstweb.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController 
{
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/home")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/company")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String company()
	{
		return "company";
	}
}
