package com.webapp.firstweb.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.firstweb.Model.Employees;

public interface EmployeeRepo extends JpaRepository<Employees, Integer> {
	
	public Employees findByEmail(String email);

}
