package com.augusto.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.augusto.cursomc.domain.Categoria;
import com.augusto.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	//essa annotation faz com que a dependencia seja instanciada automaticamente pelo Spring
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		//necessario a partir da versao 2 do Spring
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
