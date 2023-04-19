package com.backend.porfolio.dao;

import com.backend.porfolio.model.User;
import org.springframework.data.repository.CrudRepository;


public interface IUserDao extends CrudRepository<User, Long>{
    
}
