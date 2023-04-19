package com.backend.porfolio.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name = "messages")
public class Message implements Serializable, Model {
	/**
	* 
	*/
	private static final long serialVersionUID = -1196256761901650766L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String message;
 
	@CreationTimestamp
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
    private Calendar messagedate;
}
