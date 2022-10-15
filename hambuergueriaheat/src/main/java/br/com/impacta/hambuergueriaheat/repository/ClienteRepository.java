package br.com.impacta.hambuergueriaheat.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.impacta.hambuergueriaheat.model.Cliente;
import lombok.Getter;
import lombok.Setter;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
