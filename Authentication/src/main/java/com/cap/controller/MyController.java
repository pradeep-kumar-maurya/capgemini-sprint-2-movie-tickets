package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.Authentication;
import com.cap.service.AuthenticationServiceI;

@EnableDiscoveryClient
@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {

	@Autowired
	private AuthenticationServiceI service;
	
	@GetMapping("/authenticate/{username}/{password}")
	public ResponseEntity<Authentication> authenticate(@PathVariable("username") String uname, @PathVariable("password") String pass) {
		Authentication auth = service.authenticate(uname, pass);
		ResponseEntity<Authentication> response = new ResponseEntity<Authentication>(auth,HttpStatus.OK);
		return response;
	}
}
