package com.backend.porfolio.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "usuarios")
@ToString @EqualsAndHashCode
public class UsuarioP implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3520172266407055137L;

	   @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Getter @Setter @Column(name = "id")
	    private Long id;

	    @Getter @Setter @Column(name = "nombre")
	    private String nombre;

	    @Getter @Setter @Column(name = "apellido")
	    private String apellido;

	    @Getter @Setter @Column(name = "email")
	    private String email;

	    @Getter @Setter @Column(name = "telefono")
	    private String telefono;

	    @Getter @Setter @Column(name = "password")
	    private String password;
}
