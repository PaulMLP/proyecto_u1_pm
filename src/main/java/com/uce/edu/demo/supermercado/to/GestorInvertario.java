package com.uce.edu.demo.supermercado.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GestorInvertario {

	private LocalDateTime fecha;
	private BigDecimal precio;

	// SET y GET
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}
