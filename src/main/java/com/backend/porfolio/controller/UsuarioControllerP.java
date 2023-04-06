package com.backend.porfolio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.porfolio.dao.IUsuarioDao;
import com.backend.porfolio.dao.UsuarioDaoImp;
import com.backend.porfolio.model.UsuarioP;

@RestController
public class UsuarioControllerP implements IUsuarioDao{
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
    @RequestMapping(value="usuario")
    public UsuarioP getUsuario(@PathVariable Long id) {
    	UsuarioP usuario = new UsuarioP();
    	usuario.setId(id);
    	usuario.setNombre("gerson");
    	usuario.setApellido("visoso");
        usuario.setEmail("visoso126@gmail.com");
    	return usuario;
    }
    @RequestMapping(value="pruega")
    public void prueba() {
    	
    }
    
    @Override
    @RequestMapping(value="usuarios")
    public List<UsuarioP> getUsuarios(){
       // return usuarioDao.getUsuario();	
    	return usuarioDao.getUsuarios();
    }
	@Override
	@RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		usuarioDao.delete(id);
	}
    


	
}
