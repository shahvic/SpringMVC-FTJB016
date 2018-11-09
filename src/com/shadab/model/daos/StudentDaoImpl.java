package com.shadab.model.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shadab.db.utils.DBUtils;
import com.shadab.model.Student;

@Service
public class StudentDaoImpl implements StudentDao{

	@Override
	public void save(Student student) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Connection connection = DBUtils.getConnection();
		
		Statement statement = connection.createStatement();
		
		String query ="insert into students values ('"+student.getStudentName()+"',"
		+student.getStudentRollNum()+",'"+student.getStudentCourse()+"','"
				+student.getStudentAddress()+"')";
		
		statement.execute(query);
		
	}

	@Override
	public void update(Student student, String conditions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Student fetchStudentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student fetchStudentRoll(int roll) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> fetchStudents() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection connection = DBUtils.getConnection();
		
		Statement statement = connection.createStatement();
		
		String query ="select * from students";
	//	String samplequery="select * from students where name='"+Student.getname+"'"
		ResultSet result =	statement.executeQuery(query);
		List<Student> studentList = new ArrayList<>();
		while(result.next()) {
			Student student = new Student();
			System.out.println(result.getString(1));
			student.setStudentName(result.getString("name"));
			student.setStudentCourse(result.getString("course"));
			student.setStudentAddress(result.getString("address"));
			studentList.add(student);
 			
		}
		
		return studentList;
	}

}
