package com.uce.edu.demo.supermercado.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Producto {
	
	private String codigo;
	private String nombre;
	private BigDecimal precio;

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=$" + precio.setScale(2, RoundingMode.CEILING) + "]";
	}

	// SET y GET
	public String getNombre() {
		return nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}
