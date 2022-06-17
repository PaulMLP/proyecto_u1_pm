package com.uce.edu.demo.transporte.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.transporte.modelo.Registro;
import com.uce.edu.demo.transporte.repository.IRegistroRepository;

@Service
public class RegistroServiceImpl implements IRegistroService {

	@Autowired
	private IRegistroRepository registroRepository;
	
	@Override
	public void ingresarRegistro(String cedula, BigDecimal saldo,BigDecimal monto) {
		// TODO Auto-generated method stub
		Registro r = new Registro();
		r.setCedula(cedula);
		r.setSaldo(saldo.subtract(monto));
		r.setFecha(LocalDateTime.now());
		r.setUnidad("AD100");
		this.registroRepository.insertar(r);
	}

	@Override
	public void actualizarRegistro(Registro r) {
		// TODO Auto-generated method stub
		this.registroRepository.actualizar(r);
	}

}
