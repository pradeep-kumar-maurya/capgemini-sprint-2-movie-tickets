package com.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Theatre;
import com.cap.dao.TheatreDaoI;

@Service
@Transactional
public class TheatreService implements TheatreServiceI {

	@Autowired
	private TheatreDaoI dao;
	
	@Override
	public List<Theatre> theatreNames(String name) {
		List<Theatre> list = dao.theatreNames(name);
		return list;
	}

}
