package com.javatpoint.springbootexample.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.springbootexample.model.City;
import com.javatpoint.springbootexample.service.CityService;

@RestController
public class MyController {
	@Autowired
	CityService cityService;
	
	@RequestMapping(value = "/getcities")
	public Iterable<City> getmessage()
	{
		Iterable<City> citiList=new ArrayList<>();
		citiList=cityService.findAll();
		return citiList;
	}

}
