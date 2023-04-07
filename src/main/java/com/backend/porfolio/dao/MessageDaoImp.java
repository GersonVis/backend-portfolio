package com.backend.porfolio.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.backend.porfolio.model.Message;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MessageDaoImp implements IMessageDao{
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Message> getMessages() {
		String query = "FROM Message";
		return entityManager.createQuery(query).getResultList();
	}

}
