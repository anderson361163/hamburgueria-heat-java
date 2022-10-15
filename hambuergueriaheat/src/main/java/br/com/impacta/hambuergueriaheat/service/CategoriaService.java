package br.com.impacta.hambuergueriaheat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.impacta.hambuergueriaheat.model.Categoria;
import br.com.impacta.hambuergueriaheat.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> listarTodasCategorias(){
		return categoriaRepository.findAll();
	}
}
