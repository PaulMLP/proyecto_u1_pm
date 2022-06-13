package com.uce.edu.demo.supermercado.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

public class Inventario {
	
	private String nombre;
	private BigDecimal precioVenta;
	private int cantidad;
	private LocalDateTime fecha;

	@Override
	public String toString() {
		return nombre + " - " +cantidad+" - $"+precioVenta.setScale(2, RoundingMode.CEILING)+" - "+fecha;
	}

	// SET y GET
	public int getCantidad() {
		return cantidad;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

}
