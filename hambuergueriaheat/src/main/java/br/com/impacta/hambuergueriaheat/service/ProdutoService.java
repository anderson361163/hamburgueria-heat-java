package br.com.impacta.hambuergueriaheat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.impacta.hambuergueriaheat.model.Produto;
import br.com.impacta.hambuergueriaheat.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository serviceProduto;

	public List<Produto> listarTudo() {
		return serviceProduto.findAll();
	}

}
