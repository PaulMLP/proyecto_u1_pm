package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se realizo el retiro: " + r);
	}

	@Override
	public void actualizarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el Retiro: " + r);
	}

	@Override
	public Retiro buscarRetiro(String c) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el deposito: " + c);
		Retiro r = new Retiro();
		r.setNumeroCuenta(c);
		return r;
	}

	@Override
	public void borrarRetiro(String c) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el retiro de la cuenta: " + c);
	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		// Aqui deberia estar el SQL a la base
		List<Retiro> listaRetiros = new ArrayList<>();
		Retiro reti1 = new Retiro();
		reti1.setFecha(LocalDateTime.of(2022, 12, 20, 13, 34, 10));
		reti1.setMonto(new BigDecimal(25));
		reti1.setNumeroCuenta("1236");

		listaRetiros.add(reti1);

		return listaRetiros;
	}

}
