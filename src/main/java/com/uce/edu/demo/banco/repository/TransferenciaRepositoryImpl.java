package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia: "+ t);
	}

	@Override
	public Transferencia buscarTransferencia(String c) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la transferencia: "+c);
		Transferencia t = new Transferencia();
		t.setCodigoTransferencia(c);
		return t;
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo la transferencia "+ t);
	}

	@Override
	public void borrar(String c) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino la transferencia "+ c);
	}

}
