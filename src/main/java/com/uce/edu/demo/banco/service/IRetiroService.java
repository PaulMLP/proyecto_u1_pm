package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {

	public void realizarRetiro(String numeroCta, String clave, BigDecimal monto);
	
	public void actualizarrRetiro(Retiro r);
	
	public Retiro buscarRetiro(String c);
	
	public void cancelarRetiro(String c);
	
}
