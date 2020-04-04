package com.example.examen.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name ="TSuministro")
public class Suministro {

	/***************   Mapeo a tabla    ******************/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="gradocalidad")
	private String gradocalidad;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="bodega")
	private String bodega;
	
	@Column(name="cantidadcaja")
	private int cantidadcaja;
	
	@Column(name="created")
	private Date created;
	
	@Transient
	private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	
	public String getCreatedAsShort() {
		return format.format(created);
	}
	
	/***************   Constructores    ******************/
	
	public Suministro(String nombre, String gradocalidad, int cantidad, String bodega,  int cantidadcaja) throws
	ParseException {
	this.nombre = nombre;
	this.gradocalidad = gradocalidad;
	this.cantidad = cantidad;
	this.bodega = bodega;
	this.cantidadcaja = cantidadcaja;
	this.created =  new Date();
	}
	
	public Suministro(String nombre, String gradocalidad, int cantidad, String bodega, int cantidadcaja, String date) throws
	ParseException {
	this.nombre = nombre;
	this.gradocalidad = gradocalidad;
	this.cantidad = cantidad;
	this.bodega = bodega;
	this.cantidadcaja = cantidadcaja;
	this.created = format.parse(date);
	}
	
	public Suministro() {}

	
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

	public String getGradocalidad() {
		return gradocalidad;
	}

	public void setGradocalidad(String gradocalidad) {
		this.gradocalidad = gradocalidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getBodega() {
		return bodega;
	}

	public void setBodega(String bodega) {
		this.bodega = bodega;
	}

	public int getCantidadcaja() {
		return cantidadcaja;
	}

	public void setCantidadcaja(int cantidadcaja) {
		this.cantidadcaja = cantidadcaja;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
}
