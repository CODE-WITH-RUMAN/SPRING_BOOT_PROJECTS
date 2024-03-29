package com.webapp.firstweb.Config;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.webapp.firstweb.Model.Employees;

public class CustomUserDetails implements UserDetails{
	
	private Employees emp;
	
	public CustomUserDetails(Employees emp) {
		super();
		this.emp = emp;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority Authority = new SimpleGrantedAuthority(emp.getRoles());
		return Arrays.asList(Authority);
	}

	@Override
	public String getPassword() {
		
		return emp.getPassword();
	}

	@Override
	public String getUsername() {
		
		return emp.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
