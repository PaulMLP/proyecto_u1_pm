package com.uce.edu.demo.supermercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.supermercado.modelo.Producto;
import com.uce.edu.demo.supermercado.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoRepository iProductoRepository;

	@Override
	public void ingresarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.insertarProducto(p);
	}

	@Override
	public Producto buscarProducto(String c) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscarProducto(c);
	}

	@Override
	public void actualizarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizarProducto(p);
	}

	@Override
	public void borrarProducto(String c) {
		// TODO Auto-generated method stub
		this.iProductoRepository.eliminarProducto(c);
	}

}
