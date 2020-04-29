package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Payments;
import com.cap.dao.PaymentsDaoI;

@Service
@Transactional
public class PaymentsService implements PaymentsServiceI {
	
	@Autowired
	private PaymentsDaoI dao;

	@Override
	public String payments(Payments pay) {
		dao.save(pay);
		int booking_id = pay.getBooking_id();
		return "Booking ref  : "+booking_id;
	}
}