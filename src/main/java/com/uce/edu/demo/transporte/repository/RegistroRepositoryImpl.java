package com.uce.edu.demo.transporte.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.transporte.modelo.Registro;

@Repository
public class RegistroRepositoryImpl implements IRegistroRepository{

	@Override
	public void insertar(Registro r) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto en la base de datos "+r);
	}

	@Override
	public List<Registro> consultar(String cedula) {
		// TODO Auto-generated method stub
		List<Registro> listaRegistro = new ArrayList<>();
		Registro r = new Registro();
		r.setCedula(cedula);
		r.setFecha(LocalDateTime.now());
		r.setUnidad("AD100");
		r.setMonto(new BigDecimal(0.25));
		listaRegistro.add(r);
		return listaRegistro;
	}

	@Override
	public void actualizar(Registro r) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el "+r);
	}

}
