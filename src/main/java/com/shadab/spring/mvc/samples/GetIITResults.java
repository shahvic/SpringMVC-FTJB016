package com.shadab.spring.mvc.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetIITResults extends HttpServlet{
	// roll number
	// result
	public void doTask() {}
	int a=10;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello servlet is getting executed!!!!");
		String rollNumber = req.getParameter("rollnumber");
		PrintWriter pw = resp.getWriter();
		pw.write("<html><body>Hello i am old servlet result for roll number  "+rollNumber+" 60%");
				
	 
		pw.write("</body></html>");
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do Post being executed!!!!");
	}
	

}
