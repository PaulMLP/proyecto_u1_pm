package com.uce.edu.demo.transporte.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Registro {

	private String codigo;
	private LocalDateTime fecha;
	private String unidad;
	private String cedula;
	private BigDecimal monto;
	private BigDecimal saldo;

	@Override
	public String toString() {
		return "Registro [codigo=" + codigo + ", fecha=" + fecha + ", unidad=" + unidad + ", cedula=" + cedula
				+ ", monto=" + monto + ", saldo=" + saldo + "]";
	}

	// SET y GET
	public LocalDateTime getFecha() {
		return fecha;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

}
