package com.phdev.springwebservice.mail;

import java.util.Random;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.phdev.springwebservice.entities.Usuario;
import com.phdev.springwebservice.repositories.Usuario_LoginRepository;

@RestController
public class EmailController {
	
	@Autowired
	private JavaMailSender mailSender;
	
	
	@Autowired private MailResponse mailResponse;

	@Autowired
	private Usuario_LoginRepository usuario_LoginRepository;

	@PostMapping(path = "/email-send")
	public ResponseEntity<MailResponse> sendMail(@RequestBody Usuario usuario) {

		Boolean exists = usuario_LoginRepository.mailExists(usuario.getEmail());
		String newPassword = RandomPassword.generatePassword();
		
		MimeMessage mail = mailSender.createMimeMessage();
		
		MimeMessageHelper helper = new MimeMessageHelper(mail); 		
		System.out.println(exists);
		System.out.println(usuario.getEmail());
		if(exists != false) {    		
			
			try {
				
				helper.setSubject(MailMessage.emailSubject);
				helper.setText(new MailMessage(newPassword).mailContent(), true);
				helper.setTo(usuario.getEmail());
				helper.setFrom("paulohbragap@yahoo.com");
				mailSender.send(mail);
				usuario_LoginRepository.updateUserPassword(usuario.getEmail(), newPassword );
				mailResponse.responseMail = "sucess";
				return ResponseEntity.ok().body(mailResponse);
				
			} catch (Exception e) {
				
				e.printStackTrace();

			}
		}

		mailResponse.responseMail = "fail";

		return ResponseEntity.ok().body(mailResponse);

	}
}