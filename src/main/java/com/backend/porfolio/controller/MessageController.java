package com.backend.porfolio.controller;



import java.io.IOError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.helpers.CheckReturnValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.porfolio.dao.IMessageDao;
import com.backend.porfolio.model.Message;
import com.backend.porfolio.model.Model;
import com.backend.porfolio.model.Recivido;
import com.backend.porfolio.response.Header;
import com.backend.porfolio.response.MessageResponseRest;
import com.backend.porfolio.response.Response;
import com.backend.porfolio.services.IMessageService;
import com.local.inventory.model.Product;
import com.local.inventory.response.ProductResponse;

import jakarta.persistence.EntityExistsException;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
public class MessageController {
    @Autowired
    private IMessageService messageService;

    @RequestMapping(value="message/list", method= RequestMethod.GET)
    public ResponseEntity<MessageResponseRest> getMessage() {
    	return messageService.getMessages();
    }
    @RequestMapping(value="message/insert", method= RequestMethod.POST)
    public ResponseEntity<MessageResponseRest> setMessage(@RequestBody Message message){
    	return messageService.save(message);
    }
    
}

