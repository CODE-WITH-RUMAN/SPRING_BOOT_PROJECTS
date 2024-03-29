package com.webapp.firstweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.firstweb.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
