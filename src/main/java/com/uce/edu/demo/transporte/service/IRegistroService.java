package com.uce.edu.demo.transporte.service;

import java.math.BigDecimal;

import com.uce.edu.demo.transporte.modelo.Registro;

public interface IRegistroService {

	public void ingresarRegistro(String cedula, BigDecimal saldo, BigDecimal monto);
	
	public void actualizarRegistro(Registro r);
}
