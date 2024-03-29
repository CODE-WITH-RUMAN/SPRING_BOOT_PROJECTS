package com.webapp.firstweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.firstweb.model.Student;
import com.webapp.firstweb.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentrepo;
	
	public List<Student> GetData()
	{
		return studentrepo.findAll();
	}
	
	public Student SendData(Student student)
	{
		return studentrepo.save(student);
	}
	
	public Student UpdateData(Student student)
	{
		return studentrepo.save(student);
	}
	
	public void DeleteData()
	{
		studentrepo.deleteAll();;
	}
	
	
}
