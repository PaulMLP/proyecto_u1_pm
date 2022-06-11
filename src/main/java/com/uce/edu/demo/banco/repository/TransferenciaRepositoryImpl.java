package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFinal) {
		// TODO Auto-generated method stub
		// Aqui deberia estar el SQL a la base
		List<Transferencia> listaConsultada = new ArrayList<>();
		Transferencia trans1 = new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaDestino("1234");
		trans1.setNumeroCuentaOrigen("4321");
		
		listaConsultada.add(trans1);
		
		return listaConsultada;
	}

}
