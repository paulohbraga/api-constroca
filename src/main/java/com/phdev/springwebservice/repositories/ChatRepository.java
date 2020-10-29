package com.phdev.springwebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.phdev.springwebservice.entities.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
	//select id from tb_chat tc where tc.receiver = 50 and tc.sender = 2 or tc.receiver = 2 and tc.sender = 50 ;
    @Query("SELECT id FROM Chat c WHERE c.sender = :sender and c.receiver = :receiver or c.sender = :sender and c.receiver = :receiver ")
    Long chatExists(@Param("sender") Integer integer, @Param("receiver") Integer integer2);
    
    @Query(value = "SELECT sender FROM tb_chat m WHERE m.chat_id = 78 LIMIT 1", nativeQuery=true)
    Integer findSenderByChatId(Long id_chat);
    @Query(value = "SELECT receiver FROM tb_chat m WHERE m.chat_id = 78 LIMIT 1", nativeQuery=true)
    Integer findReceiverByChatId(Long id_chat);
	

}
