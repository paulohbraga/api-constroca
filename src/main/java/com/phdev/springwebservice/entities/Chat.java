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
	private Long sender;
	private Long receiver;
	
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
		this.sender = sender.getId();
		this.receiver = receiver.getId();
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
