package com.example.examen.domain;

import java.text.ParseException;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TBodega")
public class Bodega {

	/***************   Mapeo a tabla    ******************/
	
	@Id
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	
	/***************   Constructores    ******************/
	
	public Bodega(String nombre) throws	ParseException {
	this.nombre = nombre;
	}
	
	public Bodega() {}

	
	/***************   Getters/ Setters    ******************/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
