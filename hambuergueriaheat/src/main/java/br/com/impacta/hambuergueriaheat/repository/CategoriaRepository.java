package br.com.impacta.hambuergueriaheat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.impacta.hambuergueriaheat.model.Categorias;

@Repository
public interface CategoriaRepository extends JpaRepository<Categorias, Long>{ 
	

}
