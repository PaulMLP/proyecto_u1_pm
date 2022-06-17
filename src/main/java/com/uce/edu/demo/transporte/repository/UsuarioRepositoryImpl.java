package com.uce.edu.demo.transporte.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.transporte.modelo.Usuario;

@Repository
public class UsuarioRepositoryImpl implements IUsuarioRepository{

	@Override
	public void insertar(Usuario u) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto en la base de datos: "+u);
	}

	@Override
	public Usuario buscar(String cedula) {
		// TODO Auto-generated method stub
		Usuario u = new Usuario();
		u.setCedula(cedula);
		return u;
	}

}
