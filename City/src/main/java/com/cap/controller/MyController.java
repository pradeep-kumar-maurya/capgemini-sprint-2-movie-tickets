package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.City;
import com.cap.service.CityServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {

	@Autowired
	private CityServiceI service;
	
	@GetMapping("/cities")
	public List<City> cityNames(){
		List<City> list = service.getCityNames();
		return list;
	}
}
