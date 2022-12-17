package br.com.impacta.hambuergueriaheat.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class UsuarioPapeis {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Usuarios usuario;
	@ManyToOne
	private Papeis papel;
	
}
