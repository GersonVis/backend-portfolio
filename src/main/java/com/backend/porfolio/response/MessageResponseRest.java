package com.backend.porfolio.response;
import com.backend.porfolio.response.ResponseRest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageResponseRest  extends ResponseRest{
	private MessageResponse message = new MessageResponse();
}
