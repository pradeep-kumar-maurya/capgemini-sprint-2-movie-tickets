package com.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.City;
import com.cap.dao.CityDaoI;

@Service
@Transactional
public class CityService implements CityServiceI {
	
	@Autowired
	private CityDaoI dao;

	@Override
	public List<City> getCityNames() {
		List<City> list = dao.findAll();
		return list;
	}
}
