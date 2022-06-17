package com.uce.edu.demo.transporte.repository;

import com.uce.edu.demo.transporte.modelo.Unidad;

public interface IUnidadRepository {

	public void insertar(Unidad u);
	
	public Unidad buscar(String codigo);

}
