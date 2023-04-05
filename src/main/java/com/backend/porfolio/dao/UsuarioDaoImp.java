package com.backend.porfolio.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.backend.porfolio.model.UsuarioP;

import jakarta.transaction.Transactional;


@Repository
@Transactional
public class UsuarioDaoImp implements IUsuarioDao{

	@Override
	public List<UsuarioP> getUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

}
