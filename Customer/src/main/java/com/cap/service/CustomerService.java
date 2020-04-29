package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Customer;
import com.cap.dao.CustomerDaoI;

@Service
@Transactional
public class CustomerService implements CustomerServiceI {
	
	@Autowired
	private CustomerDaoI dao;

	@Override
	public Customer getAccountData(int acc_no) {
		return dao.getAccountData(acc_no);
	}

	@Override
	public String updateAccountDetails(Customer cust) {
		boolean bool = dao.existsById(cust.getAccount_no());
		if(bool == true) {
			dao.save(cust);
			return "details updated successfully";
		}
		else {
			return "Sorry, details were not updated";
		}
	}
	
}
