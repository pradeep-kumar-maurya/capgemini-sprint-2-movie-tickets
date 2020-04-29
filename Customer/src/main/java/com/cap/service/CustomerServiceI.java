package com.cap.service;

import com.cap.bean.Customer;

public interface CustomerServiceI {

	Customer getAccountData(int acc_no);

	String updateAccountDetails(Customer cust);

}
