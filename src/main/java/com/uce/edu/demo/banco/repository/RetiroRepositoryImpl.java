package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se realizo el retiro: "+r);
	}

	@Override
	public void actualizarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el Retiro: "+ r);
	}

	@Override
	public Retiro buscarRetiro(String c) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el deposito: "+c);
		Retiro r = new Retiro();
		r.setNumeroCuenta(c);
		return r;
	}

	@Override
	public void borrarRetiro(String c) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el retiro de la cuenta: "+c);
	}

}
