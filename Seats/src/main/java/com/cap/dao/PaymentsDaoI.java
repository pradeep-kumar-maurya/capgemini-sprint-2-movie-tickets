package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.bean.Payments;

public interface PaymentsDaoI extends JpaRepository<Payments, Integer>{

}
