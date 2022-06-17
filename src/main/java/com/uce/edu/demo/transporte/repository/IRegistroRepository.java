package com.uce.edu.demo.transporte.repository;

import java.util.List;

import com.uce.edu.demo.transporte.modelo.Registro;

public interface IRegistroRepository {

	public void insertar(Registro r);
	
	public void actualizar(Registro r);
	
	public List<Registro> consultar(String cedula);
}
