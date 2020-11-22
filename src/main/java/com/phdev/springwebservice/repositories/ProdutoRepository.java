package com.phdev.springwebservice.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.google.common.base.Optional;
import com.phdev.springwebservice.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	List<Produto> findByUsuarioId(Long id_usuario);
	List<Produto> findAllByOrderByIdDesc();

	Optional<Produto> findByIdAndUsuarioId(Long id, Long id_usuario);
	
//    @Modifying
//    @Query("UPDATE Produto p SET p.nome_produto = :address WHERE c.id = :companyId")
//    int updateProduct(@Param("id") int id, @Param("address") String address);

}
