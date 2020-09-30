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

import com.phdev.springwebservice.entities.Usuario;
import com.phdev.springwebservice.repositories.UsuarioRepository;
import com.phdev.springwebservice.services.UsuarioService;

@RestController
public class UsuarioResource {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	public Page<Usuario> findAll(Pageable pageable){
		
		
		return usuarioRepository.findAll(pageable);
	}
	
	@GetMapping("/usuarios/{id}")
	public ResponseEntity<Optional<Usuario>> findUserById(@PathVariable Long id){
		
		Optional<Usuario> objUsuario = usuarioRepository.findById(id);
		
		return ResponseEntity.ok().body(objUsuario);
	}
	
	@PostMapping("/usuarios")
	public ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario){
		
		usuario = usuarioRepository.save(usuario);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId()).toUri();

		return ResponseEntity.created(uri).body(usuario);
		
	}

}
