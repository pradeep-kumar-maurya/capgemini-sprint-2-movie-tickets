package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.Theatre;
import com.cap.service.TheatreServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {
	
	@Autowired
	private TheatreServiceI service;
	
	@GetMapping("/theatres/{city-name}")
	public List<Theatre> theatreNames(@PathVariable("city-name") String name){
		List<Theatre> list = service.theatreNames(name);
		return list;
	}
}
