package com.uce.edu.demo.transporte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.transporte.modelo.Unidad;
import com.uce.edu.demo.transporte.repository.IUnidadRepository;

@Service
public class UnidadServiceImpl implements IUnidadService {

	@Autowired
	private IUnidadRepository unidadRepository;
	
	@Override
	public void insertar(Unidad u) {
		// TODO Auto-generated method stub
		this.unidadRepository.insertar(u);
	}

	@Override
	public Unidad buscar(String c) {
		// TODO Auto-generated method stub
		return this.unidadRepository.buscar(c);
	}

}
