package com.lingdu.test;

import com.lingdu.common.util.SpringUtil;
import com.lingdu.domain.User;
import com.lingdu.service.UserService;

public class SpringTest {

	public static void main(String[] args) {
		SpringUtil.init("classpath:application.xml");
		//UserService service = SpringUtil.getBean(UserService.class);
		UserService service = (UserService) SpringUtil.getBean("userService");
		User user = (User) SpringUtil.getBean("user");
		System.out.println("service : " + service.showUser(user));;
	}
}
