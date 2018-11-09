package com.shadab.model;

public class Student {
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRollNum() {
		return studentRollNum;
	}
	public void setStudentRollNum(int studentRollNum) {
		this.studentRollNum = studentRollNum;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRollNum=" + studentRollNum + ", studentCourse="
				+ studentCourse + ", studentAddress=" + studentAddress + "]";
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	private String studentName;
	private int studentRollNum;
	private String studentCourse;
	private String studentAddress;
	

}
