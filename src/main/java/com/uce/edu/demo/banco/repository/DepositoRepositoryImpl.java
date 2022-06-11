package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: " + d);
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el Deposito: " + d);
	}

	@Override
	public Deposito buscarDeposito(String c) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el deposito: " + c);
		Deposito d = new Deposito();
		d.setCodigoDeposito(c);
		return d;
	}

	@Override
	public void borrarDeposito(String c) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el deposito: " + c);
	}

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		// Aqui deberia estar el SQL a la base
		List<Deposito> listaDepositos = new ArrayList<>();
		Deposito depo1 = new Deposito();
		depo1.setFecha(LocalDateTime.of(2021, 2,10,8,50,2));
		depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuentaDestino("2345");

		listaDepositos.add(depo1);

		Deposito depo2 = new Deposito();
		depo1.setFecha(LocalDateTime.of(2021, 3,15,9,53,2));
		depo1.setMonto(new BigDecimal(50));
		depo1.setNumeroCuentaDestino("1234");

		listaDepositos.add(depo2);
		
		return listaDepositos;
	}

}
