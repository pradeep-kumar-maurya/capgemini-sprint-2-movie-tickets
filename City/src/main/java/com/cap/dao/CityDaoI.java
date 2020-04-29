package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.bean.City;

public interface CityDaoI extends JpaRepository<City, Integer>{

}
