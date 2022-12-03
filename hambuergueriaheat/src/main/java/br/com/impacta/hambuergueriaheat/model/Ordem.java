package br.com.impacta.hambuergueriaheat.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Ordem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//private Status status;
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	//private Usuario usuario;
	private String nota;
	//private OrdemProduto ordem;
	private String txid;
	private LocalDateTime criacao;
	private LocalDateTime atualizacao = LocalDateTime.now();
	
}
