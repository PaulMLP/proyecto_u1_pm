package com.uce.edu.demo.transporte.modelo;

import java.math.BigDecimal;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TicketPlus {

	private String nombre_usuario;
	private BigDecimal saldo;
	private String cedula;

	@Override
	public String toString() {
		return "TicketPlus [nombre_usuario=" + nombre_usuario + ", saldo=" + saldo + ", cedula=" + cedula + "]";
	}

	// SET y GET
	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

}
