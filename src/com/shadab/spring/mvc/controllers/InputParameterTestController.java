package com.shadab.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputParameterTestController {
	
	
	@RequestMapping(value="/inputparateretest",method=RequestMethod.GET)
	public String doSomething(@RequestParam("id") int id ,@RequestParam("name") String name) {
		
		
		System.out.println("Id from request is:===>"+id);
		System.out.println("Name from request is:===>"+name);

		return "Test";
		
	}
	
	
	
	@RequestMapping(value="/inputparateretestpost",method=RequestMethod.POST)
	public String doSomethingWithPost(@RequestParam(value="id",required=false,defaultValue="89") String  id ,@RequestParam("name") String name) {
		
		
		System.out.println("Id from request is:===>"+id);
		System.out.println("Name from request is:===>"+name);

		return "Test";
		
	}
	
	// post,get,jdbc,exceptionhandler,service,formvalidations
	
	@RequestMapping(value="/inputparateretest/{empid}/getsalary/{monthnumber}",method=RequestMethod.GET)
	public String doSomethingWithPathVariable(@PathVariable("empid") int employeeid,@PathVariable("monthnumber") int monthnumber) {
		
		
		System.out.println("employeeid from request is:===>"+employeeid);

		return "Test";
		
	}
	
	
	@RequestMapping(value="/testmodel",method=RequestMethod.GET)
	public String testModel(@RequestParam(value="id",required=false,defaultValue="89") String  id , Model model) {
		// BL
		String name="test";
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		return "ModelTest";
		
	}
	


}
