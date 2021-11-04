package com.prueba.sersaprosa.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.sersaprosa.model.Gestion;

@Repository
public interface Igestion extends CrudRepository<Gestion, Integer> {

}
