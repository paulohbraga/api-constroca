package com.phdev.springwebservice.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_chat")
public class Chat implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Usuario sender;
	private Usuario receiver;
	@OneToMany(mappedBy = "chat")
	private List<Mensagem> mensagens = new ArrayList<>();
	
	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public Chat() {
	}

	public Chat(Long id, Usuario sender, Usuario receiver) {
		super();
		this.id = id;
		this.sender = sender;
		this.receiver = receiver;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Usuario  getSender() {
		return sender;
	}

	public void setSender(Usuario  sender) {
		this.sender = sender;
	}

	public Usuario  getReceiver() {
		return receiver;
	}

	public void setReceiver(Usuario  receiver) {
		this.receiver = receiver;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
