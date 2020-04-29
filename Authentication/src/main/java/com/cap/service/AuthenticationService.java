package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Authentication;
import com.cap.dao.AuthenticationDaoI;

@Service
@Transactional
public class AuthenticationService implements AuthenticationServiceI {

	@Autowired
	private AuthenticationDaoI dao;
	
	@Override
	public Authentication authenticate(String uname, String pass) {
		return dao.authenticate(uname, pass);
	}
}