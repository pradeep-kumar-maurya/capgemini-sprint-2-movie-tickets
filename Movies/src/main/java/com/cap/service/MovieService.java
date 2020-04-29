package com.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Movies;
import com.cap.dao.MovieDaoI;

@Service
@Transactional
public class MovieService implements MovieServiceI {
	
	@Autowired
	private MovieDaoI dao;

	@Override
	public List<Movies> movieNames(String name) {
		List<Movies> list = dao.movieNames(name);
		return list;
	}
	
}
