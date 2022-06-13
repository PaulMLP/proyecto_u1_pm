package com.uce.edu.demo.supermercado.repository;

import com.uce.edu.demo.supermercado.modelo.Producto;

public interface IProductoRepository {

	public void insertarProducto(Producto p);

	public Producto buscarProducto(String c);

	public void actualizarProducto(Producto p);

	public void eliminarProducto(String c);
}
