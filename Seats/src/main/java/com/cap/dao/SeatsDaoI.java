package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.bean.Seats;

public interface SeatsDaoI extends JpaRepository<Seats, Integer>{

}