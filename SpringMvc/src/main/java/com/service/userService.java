package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.FormDao;
import com.pojo.Contact;

@Service
public class userService {
	
	@Autowired
	private FormDao dao;
	
	public int createUser(Contact con) {
		return dao.saveUser(con);
	}

}
