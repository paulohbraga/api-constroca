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
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "tb_usuario",uniqueConstraints = @UniqueConstraint(columnNames = "cpf"))
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String login_usuario;
	private String password;
	private String email;
	private String cpf;
	private String telefone;
	private String cidade;
	private String avatar;
	private String token;
	
	@OneToMany(mappedBy = "usuario")
	private List<Produto> produtos = new ArrayList<>();
	
	public Usuario() {
		
	}

	public Usuario(Long id, String nome, String login_usuario, String password, String email, String cpf, String telefone,
			String cidade, String avatar) {
		super();
		this.id = id;
		this.nome = nome;
		this.login_usuario = login_usuario;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cidade = cidade;
		this.setPassword(password);
		this.avatar = avatar;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin_usuario() {
		return login_usuario;
	}

	public void setLogin_usuario(String login_usuario) {
		this.login_usuario = login_usuario;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@JsonIgnore
	public List<Produto> getProdutos() {
		return produtos;
	}
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}


	
	

}
