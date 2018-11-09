package com.shadab.spring.mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("demoname")
public class SessionDemoController {
	
	@RequestMapping("/createsession")
	public String createSession(@RequestParam("demoname") String demoName, Model model, HttpSession session) {
		System.out.println("demoName is:"+demoName);
		System.out.println("session id is:"+session.getId());
		model.addAttribute("demoname",demoName);
		return "Test";
		
	}
	
	@RequestMapping("/killsession")
	public String killSession(  HttpServletRequest request) {
		HttpSession session =request.getSession(true);
 		System.out.println("session id is:"+session.getId());
 		session.invalidate();
 		System.out.println("session id is:"+session.getId());

		return "Test";
		
	}
}
