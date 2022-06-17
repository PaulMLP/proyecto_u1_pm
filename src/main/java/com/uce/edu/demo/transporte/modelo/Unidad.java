package com.uce.edu.demo.transporte.modelo;

import java.math.BigDecimal;

public class Unidad {

	private String codigo_unidad;
	private BigDecimal precio;

	// SET y GET
	public BigDecimal getPrecio() {
		return precio;
	}

	public String getCodigo_unidad() {
		return codigo_unidad;
	}

	public void setCodigo_unidad(String codigo_unidad) {
		this.codigo_unidad = codigo_unidad;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
}
