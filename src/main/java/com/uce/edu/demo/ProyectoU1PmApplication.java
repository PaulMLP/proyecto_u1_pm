package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IFachadaCuentaBancaria;
import com.uce.edu.demo.supermercado.modelo.Producto;
import com.uce.edu.demo.supermercado.service.IGestorInventarioService;
import com.uce.edu.demo.supermercado.service.IProductoService;

@SpringBootApplication
public class ProyectoU1PmApplication implements CommandLineRunner {

	@Autowired
	private IFachadaCuentaBancaria bancaria;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		BigDecimal interes = this.bancaria.calcularInteres("1234");
		System.out.println(interes);
	}

}
