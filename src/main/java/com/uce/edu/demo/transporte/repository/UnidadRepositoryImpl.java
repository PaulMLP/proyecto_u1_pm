package com.uce.edu.demo.transporte.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.transporte.modelo.Unidad;

@Repository
public class UnidadRepositoryImpl implements IUnidadRepository {

	@Override
	public void insertar(Unidad u) {
		// TODO Auto-generated method stub
		System.out.println("Se ingreso en la base de datos: "+u);
	}

	@Override
	public Unidad buscar(String codigo) {
		// TODO Auto-generated method stub
		Unidad u = new Unidad();
		u.setCodigo_unidad(codigo);
		return u;
	}
	
}
