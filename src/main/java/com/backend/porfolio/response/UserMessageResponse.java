package com.backend.porfolio.response;

import java.util.List;

import com.backend.porfolio.model.UserMessage;

import lombok.Data;

@Data
public class UserMessageResponse extends Response{
	 List<UserMessage> list;
}
