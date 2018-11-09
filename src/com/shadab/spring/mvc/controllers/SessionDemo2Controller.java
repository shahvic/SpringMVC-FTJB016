package com.shadab.spring.mvc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("demoname")
public class SessionDemo2Controller {

	@RequestMapping("/createsessionnew")
	public String createSession(Model model,HttpSession session) {
		System.out.println("New Controller demoName is:"+model.asMap().get("demoname"));
		System.out.println("session id is:"+session.getId());

		return "Test";
		
	}
	
}
