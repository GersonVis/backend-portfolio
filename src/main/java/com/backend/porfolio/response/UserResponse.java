package com.backend.porfolio.response;

import java.util.List;

import com.backend.porfolio.model.User;

import lombok.Data;

@Data
public class UserResponse extends Response{
	 private List<User> data;
}
