package com.javatpoint.loggerexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.loggerexample.model.User;

@RestController
public class MyController {

	@RequestMapping(value = "/userlist")
	public User getmessage() {
		User user = new User("ABC", "pqr", "vskumbhar@bflaf.com");
		return user;
	}

}
