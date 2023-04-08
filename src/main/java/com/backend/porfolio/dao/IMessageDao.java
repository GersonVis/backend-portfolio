package com.backend.porfolio.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.backend.porfolio.model.Message;
import com.backend.porfolio.model.Model;

public interface IMessageDao{
	List<Model> getMessages();
	public void insert(Message message);
}
