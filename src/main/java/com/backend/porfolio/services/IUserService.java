package com.backend.porfolio.services;

import org.springframework.http.ResponseEntity;

import com.backend.porfolio.model.User;
import com.backend.porfolio.response.UserResponseRest;

public interface IUserService {
     ResponseEntity<UserResponseRest> getUsers();
     ResponseEntity<UserResponseRest> setUser(User user);
}
