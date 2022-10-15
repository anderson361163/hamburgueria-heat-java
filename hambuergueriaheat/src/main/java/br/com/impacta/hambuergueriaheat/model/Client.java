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
public class Client {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long Id;
	private String phone;
	private String cpf;
	private String cep;
	private String rua;
	private String numero;
	private String distrito;
	private String email;
	private Order orders;
	
}
