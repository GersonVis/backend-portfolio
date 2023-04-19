package com.backend.porfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.porfolio.model.User;
import com.backend.porfolio.response.UserResponseRest;
import com.backend.porfolio.services.IUserService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
public class UserController {
	 @Autowired
	 private IUserService userService;
	
     @RequestMapping(value="user/list", method=RequestMethod.GET)
     public ResponseEntity<UserResponseRest> getUsers(){
    	 return userService.getUsers();
     }
     
     @RequestMapping(value="user/insert", method=RequestMethod.POST)
     public ResponseEntity<UserResponseRest> setUser(@RequestBody User user){
    	 return userService.setUser(user);
     }
}
