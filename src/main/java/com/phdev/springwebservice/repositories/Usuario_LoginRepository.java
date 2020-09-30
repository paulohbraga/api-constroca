package com.phdev.springwebservice.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.phdev.springwebservice.entities.Usuario;

@Repository
public interface Usuario_LoginRepository extends JpaRepository<Usuario, Long> {
	
    @Query("SELECT id FROM Usuario u WHERE u.email like :email and u.password like :password ")
    Long userExists(@Param("email") String email, @Param("password") String password);
    
    
    @Query("SELECT true FROM Usuario u WHERE u.email like :email")
    Boolean mailExists(@Param("email") String email);
    
    @Transactional
    @Modifying
    @Query("UPDATE Usuario u SET u.password =  :newPassword   WHERE u.email like :email")
    void updateUserPassword(@Param("email") String email, @Param("newPassword")  String newPassword);
    
    
     
}

