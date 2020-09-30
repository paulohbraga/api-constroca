package com.phdev.springwebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phdev.springwebservice.entities.Chat;
import com.phdev.springwebservice.entities.Usuario;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
	

}
