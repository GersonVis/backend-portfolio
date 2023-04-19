package com.backend.porfolio.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user_messages")
public class UserMessage implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 3840328996491273765L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_message_id;
	
	/*@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private User user_send;
	

	@OneToOne(fetch = FetchType.LAZY)
	private User user_recv; */
	
	
	@OneToOne(fetch = FetchType.LAZY)
	private Message message;
}
