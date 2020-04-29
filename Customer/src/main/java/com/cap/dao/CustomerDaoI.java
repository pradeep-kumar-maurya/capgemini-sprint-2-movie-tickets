package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.bean.Customer;

public interface CustomerDaoI extends JpaRepository<Customer, Integer>{

	@Query("select c from Customer c where account_no=?1")
	public Customer getAccountData(int acc_no);

}