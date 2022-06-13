package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.supermercado.modelo.Producto;
import com.uce.edu.demo.supermercado.service.IGestorInventarioService;
import com.uce.edu.demo.supermercado.service.IProductoService;

@SpringBootApplication
public class ProyectoU1PmApplication implements CommandLineRunner {

	@Autowired
	private IProductoService productoService;

	@Autowired
	private IGestorInventarioService gestorInventarioService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Producto p1 = new Producto();
		p1.setNombre("Coca Cola");
		p1.setCodigo("123");
		p1.setPrecio(new BigDecimal(1));
		this.productoService.ingresarProducto(p1);

		Producto p2 = new Producto();
		p2.setNombre("Huevos");
		p2.setCodigo("143");
		p2.setPrecio(new BigDecimal(4));
		this.productoService.ingresarProducto(p2);

		Producto p3 = new Producto();
		p3.setNombre("Doritos");
		p3.setCodigo("112");
		p3.setPrecio(new BigDecimal(2));
		this.productoService.ingresarProducto(p3);

		Producto p4 = new Producto();
		p4.setNombre("Pilsner");
		p4.setCodigo("147");
		p4.setPrecio(new BigDecimal(0.9));
		this.productoService.ingresarProducto(p4);

		Producto p5 = new Producto();
		p5.setNombre("Pollo");
		p5.setCodigo("121");
		p5.setPrecio(new BigDecimal(1.2));
		this.productoService.ingresarProducto(p5);

		this.gestorInventarioService.invetario(p1, 100, LocalDateTime.of(2022, 5, 1, 23, 3, 5));

		this.gestorInventarioService.invetario(p2, 300, LocalDateTime.of(2022, 6, 1, 23, 3, 5));

		this.gestorInventarioService.invetario(p3, 200, LocalDateTime.of(2022, 2, 1, 23, 3, 5));

		this.gestorInventarioService.invetario(p4, 500, LocalDateTime.of(2022, 1, 1, 23, 3, 5));

		this.gestorInventarioService.invetario(p5, 250, LocalDateTime.of(2022, 1, 1, 23, 3, 5));

		// inventario a partir de fecha especifica
		this.gestorInventarioService
				.reporte(this.gestorInventarioService.consultar(LocalDateTime.of(2022, 5, 1, 23, 3, 5)));
	}

}
