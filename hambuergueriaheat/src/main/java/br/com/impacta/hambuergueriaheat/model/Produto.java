package br.com.impacta.hambuergueriaheat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Categorias categoria;
	private String nome;
	@Column(name="urldafoto")
	private String urlDaFoto;
	private String descricao;
	private Integer quantidade;
	private Double preco;

	
}
