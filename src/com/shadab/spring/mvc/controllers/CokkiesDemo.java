package com.shadab.spring.mvc.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CokkiesDemo {
	
	@RequestMapping("/createcookies")
	public String createCookies(HttpServletResponse response) {
		
		Cookie cookie = new Cookie("myOrg", "CTS");
		response.addCookie(cookie);
	
		
		return "Test";
	}
	
	
	
	

}
