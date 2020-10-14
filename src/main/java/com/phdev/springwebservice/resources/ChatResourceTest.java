package com.phdev.springwebservice.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

	//	@PostMapping("/chat")
	//	public ResponseEntity<Chat> createUser(@RequestBody Chat chat){
	//		
	//		chat = chatRepository.save(chat);
	//		
	//
	//		return ResponseEntity.ok().body(chat);
	//		
	//	}

	@PostMapping("/chat")
	public ResponseEntity<Chat> createRoom(@RequestBody Chat chat){

		Boolean exists =  chatRepository.chatExists(chat.getSender(), chat.getReceiver());

		if(exists) {
			return ResponseEntity.ok(new Chat());
		}
		chat = chatRepository.save(chat);

		return ResponseEntity.ok().body(chat);

	}

}
