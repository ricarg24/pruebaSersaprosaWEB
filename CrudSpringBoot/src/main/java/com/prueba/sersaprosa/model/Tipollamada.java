package com.prueba.sersaprosa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipollamada")
public class Tipollamada {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String tipo_llamada;
	
	public Tipollamada() {
		
	}
	
	public Tipollamada(int id, String tipo_llamada) {
		super();
		this.id = id;
		this.tipo_llamada = tipo_llamada;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo_llamada() {
		return tipo_llamada;
	}
	public void setTipo_llamada(String tipo_llamada) {
		this.tipo_llamada = tipo_llamada;
	}
	
}
