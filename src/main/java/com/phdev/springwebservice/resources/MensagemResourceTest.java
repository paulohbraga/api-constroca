package com.phdev.springwebservice.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.phdev.springwebservice.entities.Chat;
import com.phdev.springwebservice.entities.Mensagem;
import com.phdev.springwebservice.entities.Produto;
import com.phdev.springwebservice.entities.Usuario;
import com.phdev.springwebservice.repositories.ChatRepository;
import com.phdev.springwebservice.repositories.MensagemRepository;
import com.phdev.springwebservice.repositories.UsuarioRepository;
import com.phdev.springwebservice.services.UsuarioService;

@RestController
public class MensagemResourceTest {
	
	@Autowired
	private MensagemRepository mensagemRepository;
	
	@GetMapping("/mensagens")
	public ResponseEntity<List<Mensagem>> findAllProducts(){
		
		List<Mensagem> list = mensagemRepository.findAll();	
		return ResponseEntity.ok().body(list);
		
	}
	
//	@GetMapping("/mensagens/{id}")
//	public ResponseEntity<Optional<Mensagem>> findUserById(@PathVariable Long id){
//		
//		Optional<Mensagem> objUsuario = mensagemRepository.findAllById(ids)
//		
//		return ResponseEntity.ok().body(objUsuario);
//	}
//	
//	@PostMapping("/usuarios")
//	public ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario){
//		
//		usuario = usuarioRepository.save(usuario);
//		
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId()).toUri();
//
//		return ResponseEntity.created(uri).body(usuario);
//		
//	}

}
