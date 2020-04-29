package com.cap.service;

import java.util.List;

import com.cap.bean.Seats;
import com.cap.exception.InvalidDetailsException;

public interface SeatsServiceI {

	List<Seats> getSeats();

	String updateSeats(Seats seat_obj) throws InvalidDetailsException;

}
