package com.phdev.springwebservice.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.google.common.base.Optional;
import com.phdev.springwebservice.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	List<Produto> findByUsuarioId(Long id_usuario);
	List<Produto> findAllByOrderByIdDesc();

	Optional<Produto> findByIdAndUsuarioId(Long id, Long id_usuario);

}
