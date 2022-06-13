package com.uce.edu.demo.supermercado.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.modelo.Producto;

public interface IInventarioService {
	public void ingresarInventario(Producto p, int cantidad, BigDecimal precio, LocalDateTime fecha);

	public void actualizarInventario(Inventario i);
}
