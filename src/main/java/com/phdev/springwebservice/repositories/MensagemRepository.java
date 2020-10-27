package com.phdev.springwebservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.phdev.springwebservice.entities.Mensagem;
import com.phdev.springwebservice.entities.Produto;
import com.phdev.springwebservice.entities.Usuario;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
	List<Mensagem> findByChatIdOrderByInstantAsc(Long id);
    String findFirstSenderByChatId(Long id_chat);

    
    
}
