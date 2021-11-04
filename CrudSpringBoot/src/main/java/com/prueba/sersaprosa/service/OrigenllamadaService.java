package com.prueba.sersaprosa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.sersaprosa.interfaceService.IorigenllamadaService;
import com.prueba.sersaprosa.interfaces.Iorigenllamada;
import com.prueba.sersaprosa.model.Gestion;
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
		return origenllamada.findById(id);
	}

	@Override
	public int save(Origenllamada origenllamda) {
		// TODO Auto-generated method stub
		int res=0;
		Origenllamada g=origenllamada.save(origenllamda);
	       if(!g.equals(null)) {
	    	   res=1;
	       }
			
			return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		origenllamada.deleteById(id);
	}

	
	
}
