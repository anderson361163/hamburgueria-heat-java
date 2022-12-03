package br.com.impacta.hambuergueriaheat.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.impacta.hambuergueriaheat.dto.DTOCategoria;
import br.com.impacta.hambuergueriaheat.dto.DTOProduto;
import br.com.impacta.hambuergueriaheat.model.Categoria;
import br.com.impacta.hambuergueriaheat.model.Produto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

//IMPEDIR QUE ESSA CLASSE SEJA INSTANCIADA
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoriaMapper {
	
	@Autowired
	public static ModelMapper modelMapper;
	
	public static Categoria toModel(DTOCategoria categoria) {
		return modelMapper.map(categoria, Categoria.class);
	}
	
	public static Produto toModel(DTOProduto categoria) {
		return modelMapper.map(categoria, Produto.class);
	}

}
