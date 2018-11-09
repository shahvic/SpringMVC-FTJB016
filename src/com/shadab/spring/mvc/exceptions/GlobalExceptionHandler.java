package com.shadab.spring.mvc.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(NullPointerException.class)
	public String dbErorr() {
		
		return "error";
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public String arithmaticEx() {
		
		return "Test";
	}
}
