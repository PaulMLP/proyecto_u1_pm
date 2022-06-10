package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: "+d);
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el Deposito: "+ d);
	}

	@Override
	public Deposito buscarDeposito(String c) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el deposito: "+c);
		Deposito d = new Deposito();
		d.setCodigoDeposito(c);
		return d;
	}

	@Override
	public void borrarDeposito(String c) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el deposito: "+c);
	}

	
}
