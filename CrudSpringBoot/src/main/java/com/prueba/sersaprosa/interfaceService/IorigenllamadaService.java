package com.prueba.sersaprosa.interfaceService;

import java.util.List;
import java.util.Optional;

import com.prueba.sersaprosa.model.Origenllamada;


public interface IorigenllamadaService {

	public List<Origenllamada>listar();
	public Optional<Origenllamada>listaId(int id);
	
	public int save(Origenllamada origenllamda);
	public void delete(int id);
	
}
