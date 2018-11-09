package com.shadab.spring.mvc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginLogoutController {
	@RequestMapping("/loginpage")
	public String loginPage() {
		
		return "login";
		
		
	}
	
	
	@RequestMapping(value="/dologin",method=RequestMethod.POST)
	public ModelAndView doLogin(@RequestParam("userid") String userId,@RequestParam("pwd") String pwd, ModelAndView modelAndView) {
		
		System.out.println("pwd---->"+pwd);
		if(pwd.equals("test123")) {
			// correct user
			modelAndView.setViewName("loginsuccess");

		}
		else {
			modelAndView.setViewName("login");

		}
		
		modelAndView.addObject("userid", userId);
		return modelAndView;		
		
	}
	
	
	@RequestMapping("/userlogout")
	public String userLogout( HttpSession session) {
		session.invalidate();
		return "logout";
		
		
	}
	
	

}
