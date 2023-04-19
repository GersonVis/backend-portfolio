package com.backend.porfolio.services;



import org.springframework.http.ResponseEntity;

import com.backend.porfolio.model.Message;
import com.backend.porfolio.response.MessageResponseRest;



public interface IMessageService {
	ResponseEntity<MessageResponseRest> getMessages();
	ResponseEntity<MessageResponseRest> save(Message message);
}
