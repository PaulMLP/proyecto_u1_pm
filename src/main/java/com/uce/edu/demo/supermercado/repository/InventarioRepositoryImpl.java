package com.uce.edu.demo.supermercado.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.supermercado.modelo.Inventario;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	// Lista de inventarios que simula la base de datos para luego acceder a estos
	// datos
	private List<Inventario> consulta = new ArrayList<>();

	@Override
	public void insertarInventario(Inventario i) {
		// TODO Auto-generated method stub
		this.consulta.add(i);
		System.out.println("Se inserto el inventario");
	}

	@Override
	public void actualizarInventario(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo inventario " + i);
	}

	@Override
	public List<Inventario> consulta(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.consulta;
	}

}
