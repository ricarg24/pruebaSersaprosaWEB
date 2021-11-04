package com.prueba.sersaprosa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "origenllamada")
public class Origenllamada {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String origen_llamada;
	/**
	 * @param id
	 * @param origen_llamada
	 */
	
	public Origenllamada() {
		
	}
	
	public Origenllamada(int id, String origen_llamada) {
		super();
		this.id = id;
		this.origen_llamada = origen_llamada;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigen_llamada() {
		return origen_llamada;
	}

	public void setOrigen_llamada(String origen_llamada) {
		this.origen_llamada = origen_llamada;
	}
	
	
	
	
	
}
