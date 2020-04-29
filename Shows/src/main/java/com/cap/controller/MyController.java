package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.Languages;
import com.cap.bean.Shows;
import com.cap.service.LanguagesServiceI;
import com.cap.service.ShowsServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {

	@Autowired
	private ShowsServiceI service;
	
	@Autowired
	private LanguagesServiceI lang_service;
	
	@GetMapping("/shows")
	public List<Shows> getShows(){
		List<Shows> list = service.getShows();
		return list;
	}
	
	@GetMapping("/languages")
	public List<Languages> getLanguage(){
		List<Languages> list = lang_service.getLanguage();
		return list;
	}
}
