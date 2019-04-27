package com.augusto.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.augusto.cursomc.domain.Categoria;

//Repository ou DAO
//annotation do spring que permite o acesso aos dados no banco
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
}
