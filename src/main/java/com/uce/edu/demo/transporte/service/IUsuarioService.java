package com.uce.edu.demo.transporte.service;

import com.uce.edu.demo.transporte.modelo.Usuario;

public interface IUsuarioService {
	public void insertarUsuario(Usuario u);
	
	public Usuario buscarUsuario(String cedula);
}
