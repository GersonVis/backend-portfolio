package com.backend.porfolio.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.backend.porfolio.model.UsuarioP;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class UsuarioDaoImp implements IUsuarioDao{
	
	@PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<UsuarioP> getUsuarios() {
        String query = "FROM UsuarioP";
        return entityManager.createQuery(query).getResultList();
    }

	@Override
	public void delete(Long id) {
		UsuarioP usuarioP = entityManager.find(UsuarioP.class, id);
		entityManager.remove(usuarioP);		
	}

	@Override
	public boolean verificarCredenciales(UsuarioP usuario) {
		String consulta = "FROM UsuarioP where email = :email and password = :password";
		return entityManager.createQuery(consulta)
		.setParameter("email", usuario.getEmail())
		.setParameter("password", usuario.getPassword())
		.getResultList().isEmpty();
		
		
	}

    


}
