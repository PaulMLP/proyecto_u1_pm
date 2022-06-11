package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {

public void insertarRetiro(Retiro r); 
	
	public void actualizarRetiro(Retiro d); 
	
	public Retiro buscarRetiro(String c); 
	
	public void borrarRetiro(String c); 
	
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
