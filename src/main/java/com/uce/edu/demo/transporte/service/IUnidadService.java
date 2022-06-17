package com.uce.edu.demo.transporte.service;

import com.uce.edu.demo.transporte.modelo.Unidad;

public interface IUnidadService {

	public void insertar(Unidad u);
	
	public Unidad buscar(String c);
}
