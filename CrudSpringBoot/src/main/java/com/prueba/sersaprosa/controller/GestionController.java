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

import com.prueba.sersaprosa.interfaceService.IgestionService;
import com.prueba.sersaprosa.interfaceService.IorigenllamadaService;
import com.prueba.sersaprosa.model.Gestion;
import com.prueba.sersaprosa.model.Origenllamada;

@Controller
@RequestMapping
public class GestionController {

	
	@Autowired
	private IgestionService gestion;
	
	@GetMapping("/listargestion")
	public String listar(Model model) {
		
		List<Gestion>gestiones=gestion.listar();
		model.addAttribute("gestiones",gestiones);
		return "consultaGestiones";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		
		model.addAttribute("gestion",new Gestion());
		return "origenForm";
	}
	
    @PostMapping("/save")
    public String save(@Validated Gestion g,Model model) {
		 
	  gestion.save(g);
		return "redirect:/listargestion";
	}
	
    @GetMapping("/editarGestion/{id}")
    public String editar(@PathVariable int id, Model model) {
    	
    	Optional<Gestion>tipo=gestion.listaId(id);
    	model.addAttribute("gestion",tipo);
    	return "origenForm";
    }
    
    
    @GetMapping("/eliminarGestion/{id}")
    public String delete(Model model,@PathVariable int id) {
    	gestion.delete(id);
    	
    	return "redirect:/listargestion";
    }
}
