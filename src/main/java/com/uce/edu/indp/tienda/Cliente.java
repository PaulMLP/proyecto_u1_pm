package com.uce.edu.indp.tienda;

import org.springframework.stereotype.Component;

@Component
public class Cliente {

	private String nombre;
	private String apellido;
	private String cedula;

	// SET y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}