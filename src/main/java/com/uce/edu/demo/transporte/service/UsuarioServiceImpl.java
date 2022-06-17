package com.uce.edu.demo.transporte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.transporte.modelo.Usuario;
import com.uce.edu.demo.transporte.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioRepository {

	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@Override
	public void insertar(Usuario u) {
		// TODO Auto-generated method stub
		this.usuarioRepository.insertar(u);
	}

	@Override
	public Usuario buscar(String c) {
		// TODO Auto-generated method stub
		return this.usuarioRepository.buscar(c);
	}

}
