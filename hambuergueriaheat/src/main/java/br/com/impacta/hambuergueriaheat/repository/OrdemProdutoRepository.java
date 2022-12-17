package br.com.impacta.hambuergueriaheat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.impacta.hambuergueriaheat.model.OrdensProdutos;

@Repository
public interface OrdemProdutoRepository extends JpaRepository<OrdensProdutos, Long>{

}
