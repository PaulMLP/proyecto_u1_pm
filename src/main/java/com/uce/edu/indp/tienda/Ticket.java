package com.uce.edu.indp.tienda;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//catalogamos como componente - service
@Service
public class Ticket {

	private LocalDateTime fechaUso;

	// 3) DI por metodo SET
	private Unidad unidad; // a su metodo SET le pongo @Autowired
	private Cliente cliente;

	// 2) DI por constructor
	public Ticket(Cliente cliente) {
		this.cliente = cliente;
		System.out.println("Cliente: DI por constructor");
	}

	public String facturar(LocalDateTime fechaUso, String nombre, String apellido, String cedula, String nombreUnidad,
			float precio) {

		this.cliente.setNombre(nombre);
		this.cliente.setApellido(apellido);
		this.cliente.setCedula(cedula);

		this.unidad.setNombre(nombreUnidad);
		this.unidad.setPrecio(precio);

		// Seteamos los atributos de la cita medica
		this.fechaUso = fechaUso;

		return "Ticket Generado";
	}

	
	@Override
	public String toString() {
		return "Ticket: DI por atributo";
	}

	// SET y GET
	public LocalDateTime getFechaUso() {
		return fechaUso;
	}

	public void setFechaUso(LocalDateTime fechaUso) {
		this.fechaUso = fechaUso;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	@Autowired
	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
		System.out.println("Unidad: DI por metodo SET");
	}

}
