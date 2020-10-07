package com.phdev.springwebservice.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;
import org.springframework.core.annotation.Order;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Where(clause = "status = 'A' ")
@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome_produto;
	private String descricao_produto;
	private String status;
	@Column
	private String tipo;
	private String imagem;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	public Produto() {
		
	}

	public Produto(Long id, String nome_produto, String descricao_produto, String status, String tipo, String imagem,
			Usuario usuario) {
		super();
		this.id = id;
		this.nome_produto = nome_produto;
		this.descricao_produto = descricao_produto;
		this.status = status;
		this.tipo = tipo;
		this.imagem = imagem;
		this.usuario = usuario;
	}
	@JsonSerialize(using = ToStringSerializer.class)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	

}
