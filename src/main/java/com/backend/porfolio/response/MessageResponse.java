package com.backend.porfolio.response;
import java.util.List;

import com.backend.porfolio.model.Message;

import lombok.Data;

@Data
public class MessageResponse {
	List<Message> messages;

}
