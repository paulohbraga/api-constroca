package com.phdev.springwebservice.resources;

import java.net.URI;
import java.time.Instant;
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
import com.phdev.springwebservice.exceptions.ResourceNotFoundException;
import com.phdev.springwebservice.repositories.ChatRepository;
import com.phdev.springwebservice.repositories.MensagemRepository;
import com.phdev.springwebservice.repositories.UsuarioRepository;
import com.phdev.springwebservice.services.UsuarioService;
import com.sun.mail.handlers.message_rfc822;

@RestController
public class MensagemResourceTest {
	
	@Autowired
	private MensagemRepository mensagemRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ChatRepository chatRepository;

	@GetMapping("/mensagens/{id}")
	public ResponseEntity<List<Mensagem>> findAll(@PathVariable Long id){
		
		List<Mensagem> list = mensagemRepository.findByChatIdOrderByInstantAsc(id);	
		return ResponseEntity.ok().body(list);
		
	}
	
	@PostMapping("/mensagens")
	public ResponseEntity<Mensagem> createUser(@RequestBody Mensagem mensagem){
		
		mensagem = mensagemRepository.save(mensagem);
		

		return ResponseEntity.ok().body(mensagem);
		
	}
	
	@PostMapping("/chat/{id_chat}/mensagens")
	public Mensagem createMessage(@PathVariable  Long id_chat,
			@RequestBody Mensagem mensagem) {
		String xString = mensagemRepository.findSenderByChatId(id_chat);
		String sender = usuarioRepository.findUserById(Long.parseLong(xString));
		System.out.println(sender);
		return chatRepository.findById(id_chat).map(chat -> {
			mensagem.setSender(sender);
			mensagem.setInstant(Instant.now());
			mensagem.setChat(chat);
			return mensagemRepository.save(mensagem);
		}).orElseThrow(() -> new ResourceNotFoundException("ID usuário " + id_chat + " não encontrado "));
	}

}
