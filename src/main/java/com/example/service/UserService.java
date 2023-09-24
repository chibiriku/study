package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserInfoMapper;
import com.example.dto.SignupForm;

@Service
public class UserService {
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public void userAdd(SignupForm signupForm) {
		userInfoMapper.userAdd(signupForm);
	}
	
	

}
