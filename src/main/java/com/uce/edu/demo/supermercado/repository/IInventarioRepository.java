package com.uce.edu.demo.supermercado.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.supermercado.modelo.Inventario;

public interface IInventarioRepository {

	public void insertarInventario(Inventario i);

	public void actualizarInventario(Inventario i);
	
	public List<Inventario> consulta(LocalDateTime fecha);
}
