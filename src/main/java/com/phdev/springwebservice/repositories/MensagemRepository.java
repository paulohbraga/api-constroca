package com.phdev.springwebservice.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.phdev.springwebservice.entities.Mensagem;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
	List<Mensagem> findByChatIdOrderByInstantAsc(Long id);
    @Query(value = "SELECT sender FROM tb_mensagens m WHERE m.chat_id = 78 LIMIT 1", nativeQuery=true)
    String findSenderByChatId(Long id_chat);
    @Query(value = "SELECT receiver FROM tb_mensagens m WHERE m.chat_id = 78 LIMIT 1", nativeQuery=true)
    String findReceiverByChatId(Long id_chat);
}
