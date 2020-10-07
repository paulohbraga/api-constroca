package com.phdev.springwebservice.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.phdev.springwebservice.entities.Chat;
import com.phdev.springwebservice.entities.Mensagem;
import com.phdev.springwebservice.entities.Produto;
import com.phdev.springwebservice.entities.Usuario;
import com.phdev.springwebservice.repositories.ChatRepository;
import com.phdev.springwebservice.repositories.MensagemRepository;
import com.phdev.springwebservice.repositories.ProdutoRepository;
import com.phdev.springwebservice.repositories.UsuarioRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ChatRepository chatRepository;

	@Autowired
	private MensagemRepository mensagemRepository;
	
	@Override
	public void run(String... args) throws Exception {

		Usuario usuario1 = new Usuario(null, "Maria", "maria", "123", "maria@gmail.com", "231231231", "619999999" , "Brasília", "avatar.png");
		Usuario usuario2 = new Usuario(null, "Paulo Henrique", "phenrique", "123", "paulo@someletras.com.br", "123123123123", "619999999", "Brasilia", "avatar.png");
		Usuario usuario3 = new Usuario(null, "João", "joao", "123", "joao@gmail.com", "123123123123", "619999999", "Brasília", "avatar.png");
		Usuario usuario4 = new Usuario(null, "Luisa", "luiza88", "123", "luiza88@gmail.com", "123123123123", "619999999", "Brasília", "avatar.png");

		usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2, usuario3, usuario4));
		
		Chat chat1 = new Chat(null, usuario1, usuario2);
		Chat chat2 = new Chat(null, usuario3, usuario4);

		
		chatRepository.save(chat1);
		chatRepository.save(chat2);
		//
		Mensagem mensagem1 = new Mensagem(null, chat1, "Oi", usuario1, usuario2);
		Mensagem mensagem2 = new Mensagem(null, chat1, "Tudo bem?", usuario1, usuario2);
		Mensagem mensagem3 = new Mensagem(null, chat1, "Tudo bem e vc?", usuario2, usuario1);
		Mensagem mensagem4 = new Mensagem(null, chat1, "Bem também", usuario1, usuario2);
		Mensagem mensagem5 = new Mensagem(null, chat1, "Me chamo Paulo", usuario2, usuario1);
		Mensagem mensagem6 = new Mensagem(null, chat1, "Me chamo Mary", usuario1, usuario2);
		Mensagem mensagem7 = new Mensagem(null, chat1, "Prazer Mary", usuario1, usuario2);
		Mensagem mensagem8 = new Mensagem(null, chat1, "Prazer Paulo", usuario2, usuario1);
		
		mensagemRepository.saveAll(Arrays.asList(mensagem1,
												 mensagem2,
												 mensagem3,
												 mensagem4,
												 mensagem5,
												 mensagem6,
												 mensagem7,
												 mensagem8));

		Produto p1 = new Produto(null, "Areia lavada", "1 metro de areia lavada", "A", "T", "3.jpg", usuario1);
		Produto p2 = new Produto(null, "Telhas coloniais", "1000 telhas", "A", "T", "1.jpg", usuario1);
		Produto p3 = new Produto(null, "Tijolos", "1 milheiro de tijolos", "A", "T", "2.jpg", usuario1);
		Produto p4 = new Produto(null, "Cimento", "30 sacos de cimento", "A", "D", "4.jpg", usuario1);
		Produto p5 = new Produto(null, "Canos", "20 canos 100m", "A", "D", "5.jpg", usuario1);

		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

	}

}
