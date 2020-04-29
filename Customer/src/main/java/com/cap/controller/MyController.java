package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.Customer;
import com.cap.service.CustomerServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {
	
	@Autowired
	private CustomerServiceI service;
	
	@GetMapping("/account_data/{account_no}")
	public ResponseEntity<Customer> getAccountData(@PathVariable("account_no") int acc_no) {
		Customer cust = service.getAccountData(acc_no);
		ResponseEntity<Customer> response = new ResponseEntity<Customer>(cust,HttpStatus.OK);
		return response;
	}
	
	@PutMapping("/update_account_data")
	public String updateAccountDetails(@RequestBody Customer cust) {
		String string = service.updateAccountDetails(cust);
		return string;
	}
}
