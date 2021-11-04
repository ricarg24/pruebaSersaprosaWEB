package com.prueba.sersaprosa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.prueba.sersaprosa.interfaceService.IgestionService;
import com.prueba.sersaprosa.interfaceService.IorigenllamadaService;
import com.prueba.sersaprosa.model.Gestion;
import com.prueba.sersaprosa.model.Origenllamada;

public class GestionController {

	
	@Autowired
	private IgestionService gestion;
	
	@GetMapping("/listargestion")
	public String listar(Model model) {
		
		List<Gestion>gestiones=gestion.listar();
		model.addAttribute("gestiones",gestiones);
		return "consultaGestiones";
	}
}
