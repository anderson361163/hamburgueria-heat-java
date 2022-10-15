package br.com.impacta.hambuergueriaheat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class OrdemProduto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//private Ordem ordem;
	//private Produto produto;
	private Long quantidade;
	
}
