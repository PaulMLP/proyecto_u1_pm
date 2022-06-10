package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {

	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto);
	
	public void actualizarrDeposito(Deposito d);
	
	public Deposito buscarDeposito(String c);
	
	public void cancelarDeposito(String c);
}
