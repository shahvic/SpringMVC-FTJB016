package com.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value= "/api")
 public class TestCont {
	
	@RequestMapping(value= {"test2"}, method=RequestMethod.GET)
	public String getData() {
		return "Test";
	}
	@RequestMapping(value= {"test3/{id}"}, method=RequestMethod.GET)
	public String getData1(@PathVariable("id") String id,@RequestParam(value="name",required=false,defaultValue="hello") String name,Model model,HttpServletRequest req) {
		System.out.println("id===>"+id);
		System.out.println("name===>"+name);
  		model.addAttribute("name",name);
  		System.out.println(req.getRequestedSessionId());
		
		return "Test";
	}

}
