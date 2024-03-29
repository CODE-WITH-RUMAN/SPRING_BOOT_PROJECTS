package com.webapp.firstweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.firstweb.model.Student;
import com.webapp.firstweb.service.StudentService;

@RestController
@RequestMapping("/")
public class WebController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/GetData")
	public List<Student> GetData() 
	{
		return studentService.GetData();
	}

	@PostMapping("/PostData")
	public String PostData(@RequestBody Student student) 
	{
		studentService.SendData(student);
		return "POSTED";
	}
	
	@PutMapping("/PutData")
	public String PutDataData(@RequestBody Student student) 
	{
		studentService.UpdateData(student);
		return "UPDATED";
	}
	
	@DeleteMapping("/DeleteData")
	public String DeleteData() 
	{
		studentService.DeleteData();
		return "DELETED";
	}
	
}
