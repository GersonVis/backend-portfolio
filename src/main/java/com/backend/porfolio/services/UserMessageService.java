package com.backend.porfolio.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.backend.porfolio.model.UserMessage;
import com.backend.porfolio.response.Header;
import com.backend.porfolio.response.UserMessageResponseRest;

import jakarta.transaction.Transactional;


import com.backend.porfolio.dao.IUserMessageDao;




@Repository
@Transactional
public class UserMessageService implements IUserMessageService{

	@Autowired
	IUserMessageDao userMessageDao;
	
	/*@Override
	public ResponseEntity<UserMessageResponseRest> save(UserMessage userMessage) {
		UserMessageResponseRest userMessageResponseRest = new UserMessageResponseRest();
		UserMessage newUserMessage = userMessageDao.save(userMessage);
		if(newUserMessage==null) {
			userMessageResponseRest.setHeader(new Header("insert", "0", "0", false));
			return new ResponseEntity<UserMessageResponseRest>(userMessageResponseRest, HttpStatus.BAD_REQUEST);
		}
		//ArrayList<UserMessage> list =  (ArrayList<UserMessage>) Arrays.asList(newUserMessage);
		//userMessageResponseRest.setList(list);
		userMessageResponseRest.setHeader(new Header("insert", "1", "1", true));
		return new ResponseEntity<UserMessageResponseRest>(userMessageResponseRest, HttpStatus.ACCEPTED);
		return null;
	}*/

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "found";
	}

}
