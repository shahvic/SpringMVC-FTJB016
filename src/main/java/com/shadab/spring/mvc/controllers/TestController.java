package com.shadab.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value="/api")
@SessionAttributes("myid")
public class TestController {

	
	@RequestMapping(value="/getstudentdemographics")
	public String getStudentDemographics(Model mdl) {
		mdl.addAttribute("myid",123);
		System.out.println("do test");
		return "Test";
	}
	
	@RequestMapping(value="/getresult")
	public void getStudentResult(Model md) {
		System.out.println("====>"+md.asMap().get("myid"));
		System.out.println("do test");
	//	return "Test";
	}
	
}


