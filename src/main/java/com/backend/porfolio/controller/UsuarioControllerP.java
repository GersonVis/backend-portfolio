package com.backend.porfolio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.porfolio.model.UsuarioP;

@RestController
public class UsuarioControllerP {
    @RequestMapping(value="usuario")
    public UsuarioP getUsuario() {
    	UsuarioP usuario = new UsuarioP();
    	usuario.setNombre("gerson");
    	usuario.setApellido("visoso");
    	return usuario;
    }
}
