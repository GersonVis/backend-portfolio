package com.backend.porfolio.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.backend.porfolio.dao.IUserDao;
import com.backend.porfolio.model.User;
import com.backend.porfolio.response.Header;
import com.backend.porfolio.response.UserResponseRest;

import jakarta.transaction.Transactional;


@Repository
@Transactional

public class UserService implements IUserService{
	@Autowired
	IUserDao userDao;

	@Override
	public ResponseEntity<UserResponseRest> getUsers() {
		List<User> users = (List<User>) userDao.findAll();
		UserResponseRest userResponseRest = new UserResponseRest();
		userResponseRest.setData(users);
		userResponseRest.setHeader(new Header("select", "1", String.valueOf(users.size()), true));;
		return new ResponseEntity<UserResponseRest>(userResponseRest, HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<UserResponseRest> setUser(User user) {
		HttpStatus status = HttpStatus.ACCEPTED;
		UserResponseRest userResponseRest = new UserResponseRest();
		userResponseRest.setData(Arrays.asList(user));
		userResponseRest.setHeader(new Header("insert", "1", "1", true));
		if(userDao.save(user)==null) {
			userResponseRest.setHeader(new Header("insert", "-1", "0", false));
			status=HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<UserResponseRest>(userResponseRest, status);
	}

}
