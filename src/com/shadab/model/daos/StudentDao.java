package com.shadab.model.daos;

import java.sql.SQLException;
import java.util.List;

import com.shadab.model.Student;

public interface StudentDao {
	
	public void save(Student student) throws SQLException, ClassNotFoundException;
	public void update(Student student,String conditions);
	public void delete(Student student);
	public Student fetchStudentByName(String name);
	public Student fetchStudentRoll(int roll);
	public List<Student> fetchStudents() throws ClassNotFoundException, SQLException;


}
