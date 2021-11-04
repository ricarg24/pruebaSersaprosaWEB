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

import com.prueba.sersaprosa.interfaceService.IorigenllamadaService;
import com.prueba.sersaprosa.interfaceService.ItipollamadaService;
import com.prueba.sersaprosa.model.Gestion;
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
	@GetMapping("/newOrigen")
	public String agregar(Model model) {
		
		model.addAttribute("origenllamada",new Origenllamada());
		return "ollamadaForm";
	}
	
    @PostMapping("/saveOrigen")
    public String save(@Validated Origenllamada g,Model model) {
		 
	  origenllamada.save(g);
		return "redirect:/listarOrigen";
	}
    
    @GetMapping("/editarOrigen/{id}")
    public String editar(@PathVariable int id, Model model) {
    	
    	Optional<Origenllamada>tipo=origenllamada.listaId(id);
    	model.addAttribute("origenllamada",tipo);
    	return "ollamadaForm";
    }
    
    @GetMapping("/eliminarOrigen/{id}")
    public String delete(Model model,@PathVariable int id) {
    	origenllamada.delete(id);
    	
    	return "redirect:/listarOrigen";
    }
}
