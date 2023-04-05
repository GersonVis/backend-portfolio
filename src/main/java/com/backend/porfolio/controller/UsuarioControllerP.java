package com.backend.porfolio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.porfolio.dao.IUsuarioDao;
import com.backend.porfolio.model.UsuarioP;

@RestController
public class UsuarioControllerP implements IUsuarioDao{
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
    @RequestMapping(value="usuarios")
    public List<UsuarioP> getUsuarios(){
    	List<UsuarioP> usuarios = new ArrayList<UsuarioP>();
    	for(int t=1; t<10; t++) {
    	    UsuarioP usuario = new UsuarioP();
    	    usuario.setId(Long.valueOf(t));
    	    usuario.setNombre("gerson"+String.valueOf(t));
    	    usuario.setApellido("visoso"+String.valueOf(t));
    	    usuario.setEmail(String.format("gersoncorreo%d@gmail.com", t));  
    	    usuarios.add(usuario);
    	}
    	return usuarios;
    }
	@Override
	public List<UsuarioP> getUsuario() {
		// TODO Auto-generated method stub
		return null;
	}
}
