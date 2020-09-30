package com.phdev.springwebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phdev.springwebservice.entities.Mensagem;
import com.phdev.springwebservice.entities.Usuario;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
	

}
