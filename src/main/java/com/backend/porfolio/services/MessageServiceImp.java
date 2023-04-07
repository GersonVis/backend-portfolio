package com.backend.porfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.backend.porfolio.dao.IMessageDao;
import com.backend.porfolio.response.MessageResponseRest;

public class MessageServiceImp implements IMessageService {
	@Autowired
	private IMessageDao imessageDao;

	@Override
	public ResponseEntity<MessageResponseRest> all() {
		// TODO Auto-generated method stub
		return null;
	}

}
