package com.webapp.firstweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		
		Employee employee = employeeRepo.findByname(name);
		
		if(employee==null)
		{
			throw new UsernameNotFoundException("USER NOT FOUND");
		}
		
		else {
			return new CustomUserDetails(employee);
		}

	}
}
