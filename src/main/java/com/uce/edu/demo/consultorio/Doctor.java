package com.uce.edu.demo.consultorio;

import org.springframework.stereotype.Component;

//les voy a poner una metadata
@Component
public class Doctor {
	private String nombre;
	private String apellido;
	private String ciudad;
	private int edad;

	// SET y GET
	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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

}
