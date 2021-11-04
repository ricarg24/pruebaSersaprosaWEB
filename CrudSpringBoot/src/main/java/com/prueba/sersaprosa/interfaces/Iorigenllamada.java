package com.prueba.sersaprosa.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.sersaprosa.model.Origenllamada;

@Repository
public interface Iorigenllamada extends CrudRepository<Origenllamada, Integer>{

}
