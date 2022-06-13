package com.uce.edu.demo.supermercado.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.modelo.Producto;

public interface IGestorInventarioService {

	public void invetario(Producto p, int cantidad, LocalDateTime fecha);
	
	public List<Inventario> consultar(LocalDateTime fecha);
	
	public void reporte(List<Inventario> lista);
}
