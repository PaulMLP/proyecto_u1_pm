package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	public void insertar(Transferencia t);	
	
	public Transferencia buscarTransferencia (String c);	
	
	public void actualizar(Transferencia t);	
	
	public void borrar(String c);	
}
