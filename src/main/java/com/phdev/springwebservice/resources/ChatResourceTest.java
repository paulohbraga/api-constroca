package com.phdev.springwebservice.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.phdev.springwebservice.entities.Chat;
import com.phdev.springwebservice.repositories.ChatRepository;

@RestController
public class ChatResourceTest {
	
	@Autowired
	private ChatRepository chatRepository;
	
	@GetMapping("/chat")
	public ResponseEntity<List<Chat>> findAllProducts(){
		
		List<Chat> list = chatRepository.findAll();	
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping("/chat/{id}")
	public ResponseEntity<Optional<Chat>> findUserById(@PathVariable Long id){
		
		Optional<Chat> objUsuario = chatRepository.findById(id);
		
		return ResponseEntity.ok().body(objUsuario);
	}
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
