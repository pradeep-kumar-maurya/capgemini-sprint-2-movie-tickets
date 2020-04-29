package com.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Shows;
import com.cap.dao.ShowsDaoI;

@Service
@Transactional
public class ShowsService implements ShowsServiceI {
	
	@Autowired
	private ShowsDaoI dao;

	@Override
	public List<Shows> getShows() {
		List<Shows> list = dao.findAll();
		return list;
	}

}
