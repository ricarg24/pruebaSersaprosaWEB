package com.prueba.sersaprosa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.sersaprosa.interfaceService.ItipollamadaService;
import com.prueba.sersaprosa.model.Gestion;
import com.prueba.sersaprosa.model.Tipollamada;

@Controller
@RequestMapping
public class TipollamadaController {

	@Autowired
	private ItipollamadaService tipollamada;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Tipollamada>tipollamadas=tipollamada.listar();
		model.addAttribute("tipollamadas",tipollamadas);
		return "index";
	}
	
	@GetMapping("/newTipo")
	public String agregar(Model model) {
		
		model.addAttribute("tipoPersona",new Tipollamada());
		return "tipoForm";
	}
	
    @PostMapping("/saveTipo")
    public String save(@Validated Tipollamada g,Model model) {
		 
    	tipollamada.save(g);
		return "redirect:/listar";
	}
    
    @GetMapping("/editarTipo/{id}")
    public String editar(@PathVariable int id, Model model) {
    	
    	Optional<Tipollamada>tipo=tipollamada.listaId(id);
    	model.addAttribute("tipoPersona",tipo);
    	return "tipoForm";
    }
    
    @GetMapping("/eliminarTipo/{id}")
    public String delete(Model model,@PathVariable int id) {
    	tipollamada.delete(id);
    	
    	return "redirect:/listar";
    }
}


