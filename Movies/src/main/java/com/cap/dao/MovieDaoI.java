package com.cap.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.bean.Movies;

public interface MovieDaoI extends JpaRepository<Movies, Integer>{

	@Query("select m from Movies m where theatres=?1")
	public List<Movies> movieNames(String name);

}