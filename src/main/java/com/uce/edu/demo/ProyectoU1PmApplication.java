package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.transporte.modelo.TicketPlus;
import com.uce.edu.demo.transporte.modelo.TicketStandar;

@SpringBootApplication
public class ProyectoU1PmApplication implements CommandLineRunner {
	
	@Autowired
	private TicketStandar ticketStandar;
	
	@Autowired
	private TicketPlus ticketPlus;

	@Autowired
	private TicketStandar ticketStandar1;
	
	@Autowired
	private TicketPlus ticketPlus1;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("----SINGLETON----");
		this.ticketPlus.setNombre_usuario("Paul");
		this.ticketPlus.setCedula("1728289521");
		this.ticketPlus.setSaldo(new BigDecimal(10));
		System.out.println(this.ticketPlus);
		
		this.ticketPlus1.setSaldo(new BigDecimal(20));
		System.out.println(this.ticketPlus1);
		
		System.out.println("----PROTOTYPE----");
		this.ticketStandar.setNombre_usuario("Leonardo");
		this.ticketStandar.setCedula("1728838201");
		this.ticketStandar.setSaldo(new BigDecimal(50));
		System.out.println(this.ticketStandar);
		

		this.ticketStandar1.setSaldo(new BigDecimal(100));
		System.out.println(this.ticketStandar1);
	}

}
