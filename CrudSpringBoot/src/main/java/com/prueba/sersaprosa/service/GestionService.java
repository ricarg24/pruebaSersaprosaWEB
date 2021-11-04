package com.prueba.sersaprosa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.sersaprosa.interfaceService.IgestionService;
import com.prueba.sersaprosa.interfaces.Igestion;
import com.prueba.sersaprosa.model.Gestion;
import com.prueba.sersaprosa.model.Origenllamada;

@Service
public class GestionService implements IgestionService{

	@Autowired Igestion gestion;

	@Override
	public List<Gestion> listar() {
		// TODO Auto-generated method stub
		return  (List<Gestion>) gestion.findAll();
	}

	@Override
	public Optional<Gestion> listaId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Gestion gestion) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
