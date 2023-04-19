package com.backend.porfolio.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="users")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4929952933725999051L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long user_id;
	
	@Column(name="email", nullable=false, unique=true, columnDefinition="varchar(255) not null")
	private String email;
}
