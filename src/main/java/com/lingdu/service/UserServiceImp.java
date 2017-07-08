package com.lingdu.service;


import org.springframework.stereotype.Service;

import com.lingdu.domain.User;

@Service
public class UserServiceImp implements UserService {

	
	public String showUser(User user) {
	
		//int i = 1/0;  //模拟一个异常
		return user.getId() + "," + user.getName();
		
	}

}
