package com.shadab.spring.mvc.controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shadab.model.Student;
import com.shadab.spring.mvc.services.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;
	
  	@RequestMapping("/student")
	public String studenDefault(Model model) {
		
		Student student = new Student();
		
	 model.addAttribute("student",student);
		
		return "Students";
	}
	
	
	
	@RequestMapping(value="/savestudent",method=RequestMethod.POST)
	public String saveStudents(@ModelAttribute Student student, Model model) throws ClassNotFoundException, SQLException {
		
		System.out.println("student name:"+student.getStudentName());
		
		studentService.modifyStudent(student, "save");
 		
		model.addAttribute("student",student);
		
		return "Students";
	}
	
	
	@RequestMapping("/fetchstudent")
	public String fetchStudent(Model model) throws ClassNotFoundException, SQLException {
		
		System.out.println(studentService.fetchStudent());
		
		Student student = new Student();
		
	 model.addAttribute("student",student);
		
		return "Students";
	}
	
	
	@RequestMapping("/studenterror")
	public String studentError(Model model)  {
		
String data = null;
data.length();
		Student student = new Student();
		
	 model.addAttribute("student",student);
		
		return "Students";
	}
	
	
	
	
	
}
