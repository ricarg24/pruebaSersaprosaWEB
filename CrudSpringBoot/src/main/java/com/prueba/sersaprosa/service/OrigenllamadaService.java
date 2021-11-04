package com.prueba.sersaprosa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.sersaprosa.interfaceService.IorigenllamadaService;
import com.prueba.sersaprosa.interfaces.Iorigenllamada;
import com.prueba.sersaprosa.model.Origenllamada;

@Service
public class OrigenllamadaService implements IorigenllamadaService {

	@Autowired Iorigenllamada origenllamada;
		
	
	@Override
	public List<Origenllamada> listar() {
		// TODO Auto-generated method stub
		return (List<Origenllamada>) origenllamada.findAll();
	}

	@Override
	public Optional<Origenllamada> listaId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Origenllamada origenllamda) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
