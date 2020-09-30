package com.phdev.springwebservice.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private Long sender;
	private Long receiver;
	
	public Mensagem(){
	}

	public Mensagem(Long id, Chat chat, String mensagem, Usuario sender, Usuario receiver) {
		super();
		this.id = id;
		this.chat = chat;
		this.mensagem = mensagem;
		this.sender = sender.getId();
		this.receiver = receiver.getId();
	}
	@JsonIgnore
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@JsonIgnore
	public Chat getChat() {
		return chat;
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

	public Long getSender() {
		return sender;
	}

	public void setSender(Usuario sender) {
		this.sender = sender.getId();
	}

	public Long getReceiver() {
		return receiver;
	}

	public void setReceiver(Usuario receiver) {
		this.receiver = receiver.getId(); 
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
