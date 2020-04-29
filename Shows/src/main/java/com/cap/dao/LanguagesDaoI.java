package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.bean.Languages;

public interface LanguagesDaoI extends JpaRepository<Languages, Integer>{

}
