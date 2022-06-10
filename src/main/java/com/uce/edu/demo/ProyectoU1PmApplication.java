package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IRetiroService;

@SpringBootApplication
public class ProyectoU1PmApplication implements CommandLineRunner {

	@Autowired
	private IRetiroService iRetiroService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.iRetiroService.realizarRetiro("10", "1234", new BigDecimal(40));
		
	}

}
