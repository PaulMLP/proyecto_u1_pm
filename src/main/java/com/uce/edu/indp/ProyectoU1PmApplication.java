package com.uce.edu.indp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.indp.tienda.Ticket;

@SpringBootApplication
public class ProyectoU1PmApplication implements CommandLineRunner {

	// 1) DI por atributo
	@Autowired
	Ticket recibo;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String respuesta = recibo.facturar(LocalDateTime.now(), "Paul", "Merizalde", "1728289521", "AE-012", 0.5f);
		System.out.println(respuesta);
		System.out.println(recibo.toString());
	}

}
