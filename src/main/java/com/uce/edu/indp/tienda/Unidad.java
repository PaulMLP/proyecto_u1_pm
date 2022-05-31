package com.uce.edu.indp.tienda;

import org.springframework.stereotype.Component;

@Component
public class Unidad {

	private String nombre;
	private float precio;

	// SET y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
