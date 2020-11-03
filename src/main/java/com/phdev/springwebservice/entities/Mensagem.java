package com.phdev.springwebservice.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_mensagens")
public class Mensagem implements Serializable{
	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "chat_id")
	private Chat chat;
	private String mensagem;	
	private String sender;
	private String receiver;
	private String name_sender;
	private String name_receiver;
	private Instant instant;
	
	public Mensagem(){
	}

	public Mensagem(Long id, Chat chat, String mensagem, String sender, String receiver, String name_sender,
			String name_receiver) {
		super();
		this.id = id;
		this.chat = chat;
		this.mensagem = mensagem;
		this.sender = sender;
		this.receiver = receiver;
		this.name_sender = name_sender;
		this.name_receiver = name_receiver;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getChat() {
		return chat.getId();
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver; 
	}

	public Instant getInstant() {
		return Instant.now();
	}

	public void setInstant(Instant instant) {
		this.instant = Instant.now();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getName_sender() {
		return name_sender;
	}

	public void setName_sender(String name_sender) {
		this.name_sender = name_sender;
	}

	public String getName_receiver() {
		return name_receiver;
	}

	public void setName_receiver(String name_receiver) {
		this.name_receiver = name_receiver;
	}
	

}
