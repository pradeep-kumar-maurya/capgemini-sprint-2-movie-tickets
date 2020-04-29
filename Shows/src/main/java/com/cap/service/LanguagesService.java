package com.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Languages;
import com.cap.dao.LanguagesDaoI;

@Service
@Transactional
public class LanguagesService implements LanguagesServiceI {

	@Autowired
	private LanguagesDaoI dao;
	
	@Override
	public List<Languages> getLanguage() {
		List<Languages> list = dao.findAll();
		return list;
	}

}
