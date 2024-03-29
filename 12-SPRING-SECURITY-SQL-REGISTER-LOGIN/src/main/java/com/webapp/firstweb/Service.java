package com.webapp.firstweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpSession;

@org.springframework.stereotype.Service
public class Service implements ServiceInterface{

	@Autowired
	EmployeeRepo employeeRepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public Employee SendData(Employee employee) {
		/* System.out.println(employee.getPassword()); */
		employee.setPassword(passwordEncoder.encode(employee.getPassword()));
		/* System.out.println(employee.getPassword()); */
		
		employee.setRole("ROLE_USER");
		
		Employee emp = employeeRepo.save(employee);
		return emp;
	}

}
