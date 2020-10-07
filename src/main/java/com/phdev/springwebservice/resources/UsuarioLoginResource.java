package com.phdev.springwebservice.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phdev.springwebservice.entities.Usuario;
import com.phdev.springwebservice.repositories.Usuario_LoginRepository;

@RestController
public class UsuarioLoginResource {

	@Autowired
	private Usuario_LoginRepository usuario_LoginRepository;

	@PostMapping("/login")
	public ResponseEntity<Optional<Usuario>> userLogin(@RequestBody Usuario usuario){

		Long idUser = usuario_LoginRepository.userExists(usuario.getEmail(), usuario.getPassword());
		Long tempUserId = 0L;
		if(idUser != null) {
			tempUserId = idUser;
			Optional<Usuario> objUsuario = usuario_LoginRepository.findById(tempUserId);
			
			return ResponseEntity.ok().body(objUsuario);
		}else {
			Optional<Usuario> userNullUsuario = Optional.ofNullable(new Usuario());
			return ResponseEntity.ok().body(userNullUsuario);
		}
		
	}

	@GetMapping("/login/{id}")
	public ResponseEntity<Optional<Usuario>> findUserLoginId(@PathVariable Long id){

		Optional<Usuario> objUsuario = usuario_LoginRepository.findById(id);

		return ResponseEntity.ok().body(objUsuario);
	}

}
