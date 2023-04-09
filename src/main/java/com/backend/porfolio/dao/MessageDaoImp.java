package com.backend.porfolio.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.backend.porfolio.model.Message;
import com.backend.porfolio.model.Model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MessageDaoImp implements IMessageDao {
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Model> getMessages() {
		String query = "FROM Message";
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public boolean insert(Message message) {

		try {
			entityManager.getTransaction().begin();
			entityManager.persist(message);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
