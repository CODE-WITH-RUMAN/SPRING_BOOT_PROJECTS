package com.webapp.firstweb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	public Employee findByname(String name);
}
