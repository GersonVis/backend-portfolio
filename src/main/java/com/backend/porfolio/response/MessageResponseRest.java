package com.backend.porfolio.response;

import java.util.List;

import com.backend.porfolio.model.Message;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageResponseRest extends Response{
	  List<Message> data;
}
