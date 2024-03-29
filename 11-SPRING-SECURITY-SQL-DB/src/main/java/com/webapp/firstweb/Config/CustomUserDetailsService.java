package com.webapp.firstweb.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.webapp.firstweb.Model.Employees;
import com.webapp.firstweb.Repo.EmployeeRepo;

@Component
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private EmployeeRepo emprepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Employees emp = emprepo.findByEmail(email);
		
		if(emp==null)
		{
			throw new UsernameNotFoundException("USER NOT FOUND");
		}
		
		else {
			return new CustomUserDetails(emp);
		}
		
	}

}
