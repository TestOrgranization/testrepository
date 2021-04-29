package com.javatpoint.springbootexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@RequestMapping(value = "/")
	public String getmessage()
	{
		return "Welcome to the Spring boot World";
		
	}
}
