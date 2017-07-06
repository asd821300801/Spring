package com.lingdu.service;


import org.springframework.stereotype.Service;

import com.lingdu.domain.User;

@Service
public class UserServiceImp implements UserService {

	
	public String showUser(User user) {
		//System.out.println(user.getId() + "," + user.getName());
		return user.getId() + "," + user.getName();
		
	}

}
