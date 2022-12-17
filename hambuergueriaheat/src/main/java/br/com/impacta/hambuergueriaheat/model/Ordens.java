package br.com.impacta.hambuergueriaheat.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import br.com.impacta.hambuergueriaheat.componente.UtilData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Ordens {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Status status;
	@ManyToOne
	private Clientes cliente;
	@ManyToOne
	private Usuarios usuario;
	
	private LocalDateTime dataCriacao;
	private LocalDateTime dataAtualizacao;
	
	
	@PrePersist
	public void dataCriacaoDoRegistro() {
		this.dataCriacao = UtilData.dataHoraAgora();
	}
	
	@PreUpdate
	public void logUserUpdateAttempt() {
		this.dataAtualizacao = UtilData.dataHoraAgora();   
	}
	
}
