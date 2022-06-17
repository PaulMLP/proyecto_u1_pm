package com.uce.edu.demo.transporte.repository;

import com.uce.edu.demo.transporte.modelo.Usuario;

public interface IUsuarioRepository {

	public void insertar(Usuario u);
	
	public Usuario buscar(String nombre);
	
}
