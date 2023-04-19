package com.backend.porfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.porfolio.services.IUserMessageService;
import com.backend.porfolio.model.UserMessage;
import com.backend.porfolio.response.UserMessageResponseRest;


@RestController
@CrossOrigin(origins="*")
public class UserMessageController {
	@Autowired
	private IUserMessageService userMessageService;
	
	@RequestMapping(value = "usermessage/insert", method = RequestMethod.POST)
	public ResponseEntity<UserMessageResponseRest> save(@RequestBody UserMessage userMessage){
		//return userMessageService.save(userMessage);
		
		return null;
	}
	
	@RequestMapping(value = "usermessage/test", method = RequestMethod.POST)
	public ResponseEntity<UserMessageResponseRest> test(@RequestBody UserMessage userMessage) {
		return userMessageService.save(userMessage);
	//	return "found";
	}
}
