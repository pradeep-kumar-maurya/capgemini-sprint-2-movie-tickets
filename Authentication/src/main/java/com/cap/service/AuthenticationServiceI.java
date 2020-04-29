package com.cap.service;

import com.cap.bean.Authentication;

public interface AuthenticationServiceI {

	Authentication authenticate(String uname, String pass);

}
