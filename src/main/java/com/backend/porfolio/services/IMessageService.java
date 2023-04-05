package com.backend.porfolio.services;
import org.springframework.http.ResponseEntity;

import com.backend.porfolio.response.MessageResponseRest;
public interface IMessageService {
    public ResponseEntity<MessageResponseRest> all();
}
