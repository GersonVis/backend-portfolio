package com.backend.porfolio.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.backend.porfolio.dao.IMessageDao;
import com.backend.porfolio.model.Message;
import com.backend.porfolio.model.Model;
import com.backend.porfolio.response.Header;
import com.backend.porfolio.response.MessageResponseRest;

import jakarta.transaction.Transactional;


@Repository
@Transactional
public class MessageService implements IMessageService {
	@Autowired
	IMessageDao messageDao;

	@Override
	public List<Message> getMessages() {
		List<Message> result =(List<Message>) messageDao.findAll();
		return  result;
	}

	
	@Override
	public ResponseEntity<MessageResponseRest> save(Message message) {
		MessageResponseRest respuesta = new MessageResponseRest();
		ArrayList<Message> list=new ArrayList<Message>();
		list.add(message);
    	respuesta.setData(list);
    	respuesta.setHeader(new Header("insert", "1", "1"));
    	if(!(messageDao.save(message)!=null)){
    		respuesta.setHeader(new Header("insert", "-1", "0"));
    	}
    	return new ResponseEntity<MessageResponseRest>(respuesta, HttpStatus.ACCEPTED);
	}

}