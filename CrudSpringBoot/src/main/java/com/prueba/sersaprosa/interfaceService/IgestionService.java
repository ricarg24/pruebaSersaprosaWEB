package com.prueba.sersaprosa.interfaceService;

import java.util.List;
import java.util.Optional;

import com.prueba.sersaprosa.model.Gestion;

public interface IgestionService {

	public List<Gestion>listar();
	public Optional<Gestion>listaId(int id);
	
	public int save(Gestion gestion);
	public void delete(int id);
}
