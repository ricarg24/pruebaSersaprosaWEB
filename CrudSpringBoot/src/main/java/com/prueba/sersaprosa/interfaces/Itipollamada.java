package com.prueba.sersaprosa.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.sersaprosa.model.Tipollamada;

@Repository
public interface Itipollamada extends CrudRepository<Tipollamada, Integer>{

}
