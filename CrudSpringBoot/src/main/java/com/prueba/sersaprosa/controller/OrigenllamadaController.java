package com.prueba.sersaprosa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.sersaprosa.interfaceService.IorigenllamadaService;
import com.prueba.sersaprosa.interfaceService.ItipollamadaService;
import com.prueba.sersaprosa.model.Origenllamada;
import com.prueba.sersaprosa.model.Tipollamada;


@Controller
@RequestMapping
public class OrigenllamadaController {

	
	@Autowired
	private IorigenllamadaService origenllamada;
	
	@GetMapping("/listarOrigen")
	public String listar(Model model) {
		
		List<Origenllamada>origenllamadas=origenllamada.listar();
		model.addAttribute("origenllamadas",origenllamadas);
		return "consultallamadas";
	}
}
