package com.phdev.springwebservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phdev.springwebservice.entities.Produto;
import com.phdev.springwebservice.entities.Usuario;
import com.phdev.springwebservice.repositories.ProdutoRepository;


@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> findAll(){
		return produtoRepository.findAll();
	}
	
	public Produto findById(Long id) {
		Optional<Produto> objUsuario = produtoRepository.findById(id);
		return objUsuario.orElseThrow(null);
	}
	
	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}

}
