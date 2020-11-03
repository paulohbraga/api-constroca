package com.phdev.springwebservice.resources;

import java.time.Instant;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.phdev.springwebservice.entities.Mensagem;
import com.phdev.springwebservice.exceptions.ResourceNotFoundException;
import com.phdev.springwebservice.repositories.ChatRepository;
import com.phdev.springwebservice.repositories.MensagemRepository;
import com.phdev.springwebservice.repositories.UsuarioRepository;

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
		
		Long a =  chatRepository.findSenderByChatId(id_chat);
		Long b =  chatRepository.findReceiverByChatId(id_chat);
		
		System.out.println(a);
		System.out.println(b);
		
		String avatarSender = usuarioRepository.findUserAvatarById(a);
		System.out.println(avatarSender);		
		String avatarReceiver = usuarioRepository.findUserAvatarById(b);
		System.out.println(avatarReceiver);
		
		String userSender = usuarioRepository.findUserById(a);
		String userReceiver = usuarioRepository.findUserById(b);
		
		System.out.println(userSender);
		System.out.println(userReceiver);
		
	
		return chatRepository.findById(id_chat).map(chat -> {
			mensagem.setInstant(Instant.now());
			//mensagem.setSender(Long.toString(a));
			//mensagem.setReceiver(Long.toString(b));
			mensagem.setName_sender(userSender);
			mensagem.setName_receiver(userReceiver);
			mensagem.setAvatar_sender(avatarSender);
			mensagem.setAvatar_receiver(avatarReceiver);
			mensagem.setChat(chat);
			return mensagemRepository.save(mensagem);
		}).orElseThrow(() -> new ResourceNotFoundException("ID chat " + id_chat + " não encontrado "));
	}

}
