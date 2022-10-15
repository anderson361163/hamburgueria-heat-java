package br.com.impacta.hambuergueriaheat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerPublico {

	@GetMapping("/")
	public String listarCategoria() {
		
		return "menu_index";
	}
}
