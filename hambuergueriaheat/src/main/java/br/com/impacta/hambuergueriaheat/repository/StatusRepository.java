package br.com.impacta.hambuergueriaheat.repository;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.impacta.hambuergueriaheat.model.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long>{

	
}
