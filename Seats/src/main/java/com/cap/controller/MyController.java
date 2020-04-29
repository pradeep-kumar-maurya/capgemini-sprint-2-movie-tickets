package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.Payments;
import com.cap.bean.Seats;
import com.cap.exception.InvalidDetailsException;
import com.cap.service.PaymentsServiceI;
import com.cap.service.SeatsServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {

	@Autowired
	private SeatsServiceI service;
	
	@Autowired
	private PaymentsServiceI payment_service;
	
	@GetMapping("/seats")
	public List<Seats> getSeats(){
		List<Seats> list = service.getSeats();
		return list;
	}
	
	@PutMapping("/update_seats")
	public String updateSeats(@RequestBody Seats seat_obj) throws InvalidDetailsException {
		String string = service.updateSeats(seat_obj);
		return string;
	}
	
	@PostMapping("/payments") 
	public String payments(@RequestBody Payments pay) {
		String string = payment_service.payments(pay); 
		return string; 
	}
	
	// controller level exception handling
		@ExceptionHandler(InvalidDetailsException.class) 
		public ResponseEntity<String> seatNotFound(InvalidDetailsException e){
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND); 
		}
}