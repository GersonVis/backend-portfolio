package com.backend.porfolio.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioP {
   private Long id;
   private String nombre;
   private String apellido;
   private String email;
   private String telefono;
   private String password;
}
