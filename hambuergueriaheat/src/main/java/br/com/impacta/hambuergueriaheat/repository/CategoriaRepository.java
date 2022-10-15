package br.com.impacta.hambuergueriaheat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.impacta.hambuergueriaheat.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{ 
	

}
