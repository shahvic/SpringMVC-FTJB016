package com.shadab.spring.mvc.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shadab.model.Student;
import com.shadab.model.daos.StudentDaoImpl;

@Service
public class StudentService {
	@Autowired
	StudentDaoImpl studentDaoImpl;
	public void modifyStudent(Student student, String mode) throws ClassNotFoundException, SQLException {
		
		if(mode.equals("save")) {
			studentDaoImpl.save(student);
		}
		else {
			// update
		}
		
	}
	
	
	public List<Student> fetchStudent() throws ClassNotFoundException, SQLException{
		
		return studentDaoImpl.fetchStudents();
		
	}

}
