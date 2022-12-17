package br.com.impacta.hambuergueriaheat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.impacta.hambuergueriaheat.model.Categorias;
import br.com.impacta.hambuergueriaheat.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categorias> listarTodasCategorias(){
		return categoriaRepository.findAll();
	}
	
	public Categorias salvarCategoria(Categorias categoria){
		//converter
		
		
		return categoriaRepository.save(categoria);
	}
	
}
