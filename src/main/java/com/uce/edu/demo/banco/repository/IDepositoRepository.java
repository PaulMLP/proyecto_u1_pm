package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {
	public void insertarDeposito(Deposito d); 
	
	public void actualizar(Deposito d); 
	
	public Deposito buscarDeposito(String c); 
	
	public void borrarDeposito(String c); 
	
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
