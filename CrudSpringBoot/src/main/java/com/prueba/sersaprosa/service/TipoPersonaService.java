package com.prueba.sersaprosa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.sersaprosa.interfaceService.ItipollamadaService;
import com.prueba.sersaprosa.interfaces.Itipollamada;
import com.prueba.sersaprosa.model.Tipollamada;

@Service
public class TipoPersonaService implements ItipollamadaService{

	@Autowired
	private Itipollamada tipollamada;
	
	
	@Override
	public List<Tipollamada> listar() {
		// TODO Auto-generated method stub
		return (List<Tipollamada>) tipollamada.findAll();
	}

	@Override
	public Optional<Tipollamada> listaId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Tipollamada tipollamada) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
