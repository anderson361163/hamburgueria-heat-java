package br.com.impacta.hambuergueriaheat.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nomeCompleto;
	private String telefone;
	private String cpf;
	private String rua;
	private String numero;
	private String distrito;
	
	@OneToMany
	private List<Ordens> ordem;
}
