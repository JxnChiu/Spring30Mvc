package com.tutorial.SpringTutorial.Service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public Integer getUserId() {
		System.out.println("進入了 UserService 的 getUserId 方法");
		int userId = 5;
		return userId;
	}

}
