package com.uce.edu.demo.supermercado.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.supermercado.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void insertarProducto(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto el producto "+ p + "en la base de datos");
	}

	@Override
	public Producto buscarProducto(String c) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el producto "+ c);
		Producto p = new Producto();
		p.setNombre(c);
		return p;
	}

	@Override
	public void actualizarProducto(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo producto en la base de datos");
	}

	@Override
	public void eliminarProducto(String c) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino producto "+c+" de la base de datos");
	}

}
