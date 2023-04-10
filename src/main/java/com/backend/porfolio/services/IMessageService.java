package com.backend.porfolio.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.backend.porfolio.model.Message;
import com.backend.porfolio.response.MessageResponseRest;

import ch.qos.logback.core.model.Model;

public interface IMessageService {
	List<Message> getMessages();
	ResponseEntity<MessageResponseRest> save(Message message);
}
