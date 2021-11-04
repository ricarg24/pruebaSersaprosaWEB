package com.prueba.sersaprosa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gestion")
public class Gestion {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int origen_llamada_id;
	private int tipo_llamada_id;
	private String nombre;
	private String gestion;
	private String telefono;
	/**
	 * 
	 */
	public Gestion() {
		
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param origen_llamada_id
	 * @param tipo_llamada_id
	 * @param nombre
	 * @param gestion
	 * @param telefono
	 */
	public Gestion(int id, int origen_llamada_id, int tipo_llamada_id, String nombre, String gestion, String telefono) {
		super();
		this.id = id;
		this.origen_llamada_id = origen_llamada_id;
		this.tipo_llamada_id = tipo_llamada_id;
		this.nombre = nombre;
		this.gestion = gestion;
		this.telefono = telefono;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrigen_llamada_id() {
		return origen_llamada_id;
	}
	public void setOrigen_llamada_id(int origen_llamada_id) {
		this.origen_llamada_id = origen_llamada_id;
	}
	public int getTipo_llamada_id() {
		return tipo_llamada_id;
	}
	public void setTipo_llamada_id(int tipo_llamada_id) {
		this.tipo_llamada_id = tipo_llamada_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGestion() {
		return gestion;
	}
	public void setGestion(String gestion) {
		this.gestion = gestion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
}
