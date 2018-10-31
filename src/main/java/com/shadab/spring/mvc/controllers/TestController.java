package com.shadab.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/api")
public class TestController {

	
	@RequestMapping(value="/getstudentdemographics")
	public void getStudentDemographics() {
		System.out.println("do test");
	//	return "Test";
	}
	
	@RequestMapping(value="/getresult")
	public void getStudentResult() {
		System.out.println("do test");
	//	return "Test";
	}
	
}


