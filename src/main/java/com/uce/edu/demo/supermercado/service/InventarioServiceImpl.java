package com.uce.edu.demo.supermercado.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.modelo.Producto;
import com.uce.edu.demo.supermercado.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Override
	public void ingresarInventario(Producto p, int cantidad, BigDecimal precio, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		Inventario i = new Inventario();
		i.setNombre(p.getNombre());
		i.setCantidad(cantidad);
		i.setPrecioVenta(precio);
		i.setFecha(fecha);
		this.iInventarioRepository.insertarInventario(i);
	}
	
	@Override
	public void actualizarInventario(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.actualizarInventario(i);
	}

}
