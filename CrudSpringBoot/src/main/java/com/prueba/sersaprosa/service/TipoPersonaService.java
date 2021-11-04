package com.prueba.sersaprosa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.sersaprosa.interfaceService.ItipollamadaService;
import com.prueba.sersaprosa.interfaces.Itipollamada;
import com.prueba.sersaprosa.model.Origenllamada;
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
		return tipollamada.findById(id);
	}

	@Override
	public int save(Tipollamada tipollamda) {
		// TODO Auto-generated method stub
		int res=0;
		Tipollamada g=tipollamada.save(tipollamda);
	       if(!g.equals(null)) {
	    	   res=1;
	       }
			
			return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		tipollamada.deleteById(id);
	}

}
