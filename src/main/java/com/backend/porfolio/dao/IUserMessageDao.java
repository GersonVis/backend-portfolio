package com.backend.porfolio.dao;

import org.springframework.data.repository.CrudRepository;
import com.backend.porfolio.model.UserMessage;

public interface IUserMessageDao extends CrudRepository<UserMessage, Long>{

}
