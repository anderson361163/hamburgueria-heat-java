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
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String urlDaFoto;
	private String descricao;
	private Integer quantidade;
	private Double preco;
	//private Categoria categoria;
	
}
