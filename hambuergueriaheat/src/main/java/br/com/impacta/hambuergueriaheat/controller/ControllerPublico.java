package br.com.impacta.hambuergueriaheat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.impacta.hambuergueriaheat.model.Categorias;
import br.com.impacta.hambuergueriaheat.service.CategoriaService;

@Controller
public class ControllerPublico {

	@Autowired
	private CategoriaService serviceCategoria;
		
	
	@GetMapping("/")
	public String listarCategoria(Model model) {
		List<Categorias> listarTodasCategorias = serviceCategoria.listarTodasCategorias();
		model.addAttribute("categorias",listarTodasCategorias);
		return "paginas/menu/menu_index";
	}
}
