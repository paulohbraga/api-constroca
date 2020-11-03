package com.phdev.springwebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.phdev.springwebservice.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query(value = "SELECT nome FROM tb_usuario u WHERE u.id = :id_user", nativeQuery=true)
    String findUserById(Long id_user);

    @Query(value = "SELECT avatar FROM tb_usuario u WHERE u.id = :id_user", nativeQuery=true)
    String findUserAvatarById(Long id_user);

}
