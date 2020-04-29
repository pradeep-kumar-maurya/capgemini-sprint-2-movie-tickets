package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.bean.Authentication;

public interface AuthenticationDaoI extends JpaRepository<Authentication, Integer>{

	@Query("select a from Authentication a where username=?1 and password=?2 ")
	public Authentication authenticate(String uname, String pass);

}
