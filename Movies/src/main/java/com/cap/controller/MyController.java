package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.Movies;
import com.cap.service.MovieServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {
	
	@Autowired
	private MovieServiceI service;

	@GetMapping("/movies/{theatre-name}")
	public List<Movies> movieNames(@PathVariable("theatre-name") String name){
		List<Movies> list = service.movieNames(name);
		return list;
	}
}
