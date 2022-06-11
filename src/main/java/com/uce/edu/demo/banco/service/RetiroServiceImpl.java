package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService{

	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private IRetiroRepository iRetiroRepository;
	
	@Override
	public void realizarRetiro(String numeroCta, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cta = this.bancariaService.buscar(numeroCta);
		BigDecimal saldoCuenta = cta.getSaldo();
		if (saldoCuenta.compareTo(monto) == 1 || saldoCuenta.compareTo(monto) == 0){
			BigDecimal nuevoSaldo = saldoCuenta.subtract(monto);
			cta.setSaldo(nuevoSaldo);
			this.bancariaService.actualizar(cta);
		}
		else {
			System.out.println("Dinero insuficiente en la cuenta");
		}

		Retiro r = new Retiro();
		r.setNumeroCuenta(numeroCta);
		r.setMonto(monto);
		r.setFecha(LocalDateTime.now());
		this.iRetiroRepository.insertarRetiro(r);
	}

	@Override
	public void actualizarrRetiro(Retiro r) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.actualizarRetiro(r);
	}

	@Override
	public Retiro buscarRetiro(String c) {
		// TODO Auto-generated method stub
		return this.iRetiroRepository.buscarRetiro(c);
	}

	@Override
	public void cancelarRetiro(String c) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.borrarRetiro(c);
	}

}
