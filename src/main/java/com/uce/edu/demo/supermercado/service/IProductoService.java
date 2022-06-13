package com.uce.edu.demo.supermercado.service;

import com.uce.edu.demo.supermercado.modelo.Producto;

public interface IProductoService {

	public void ingresarProducto(Producto p);

	public Producto buscarProducto(String c);

	public void actualizarProducto(Producto p);

	public void borrarProducto(String c);
}
