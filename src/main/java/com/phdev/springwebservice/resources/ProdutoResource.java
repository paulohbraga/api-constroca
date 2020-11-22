package com.phdev.springwebservice.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phdev.springwebservice.entities.Produto;
import com.phdev.springwebservice.exceptions.ResourceNotFoundException;
import com.phdev.springwebservice.repositories.ProdutoRepository;
import com.phdev.springwebservice.repositories.UsuarioRepository;

@RestController
public class ProdutoResource {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@RequestMapping(value = "/")
	    public String index() {
	        return "Constroca";
	    }

	@GetMapping("/produtos")
	public ResponseEntity<List<Produto>> findAllProducts(){
		
		List<Produto> list = produtoRepository.findAllByOrderByIdDesc();	
		return ResponseEntity.ok().body(list);
		
	}
	
	@PostMapping("/produtos/{id}")
	public Produto updateProduct(@PathVariable Long id, @RequestBody Produto produto){
		
		return produtoRepository.findById(id).map(prod ->{
			prod.setDescricao_produto(produto.getDescricao_produto());
			prod.setNome_produto(produto.getNome_produto());
			prod.setTipo(produto.getTipo());
			prod.setImagem(produto.getImagem());
			return produtoRepository.save(prod);
		}).orElseThrow(() -> new ResourceNotFoundException("not found"));
		
		
	}

	@GetMapping("/usuarios/{id_usuario}/produtos")
	public ResponseEntity<List<Produto>> getAllUserProducts(@PathVariable Long id_usuario){
		
		List<Produto> list = produtoRepository.findByUsuarioId(id_usuario);
		return ResponseEntity.ok().body(list);
		
	}

	@PostMapping("/usuarios/{id_usuario}/produtos")
	public Produto createUserProduct(@PathVariable  Long id_usuario,
			@RequestBody Produto produto) {
		return usuarioRepository.findById(id_usuario).map(usuario -> {
			produto.setUsuario(usuario);
			return produtoRepository.save(produto);
		}).orElseThrow(() -> new ResourceNotFoundException("ID usuário " + id_usuario + " não encontrado "));
	}
	
	@DeleteMapping(value = "produtos/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		produtoRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}


}
