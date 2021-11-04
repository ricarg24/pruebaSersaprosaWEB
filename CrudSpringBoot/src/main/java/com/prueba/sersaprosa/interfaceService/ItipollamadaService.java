package com.prueba.sersaprosa.interfaceService;

import java.util.List;
import java.util.Optional;

import com.prueba.sersaprosa.model.Tipollamada;

public interface ItipollamadaService {

	public List<Tipollamada>listar();
	public Optional<Tipollamada>listaId(int id);
	
	public int save(Tipollamada tipollamada);
	public void delete(int id);
}
