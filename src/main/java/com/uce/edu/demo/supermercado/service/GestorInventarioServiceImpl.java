package com.uce.edu.demo.supermercado.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.modelo.Producto;
import com.uce.edu.demo.supermercado.repository.IInventarioRepository;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService{

	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Autowired
	private IInventarioService iInventarioService;
	
	@Override
	public void invetario(Producto p, int cantidad, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		
		// precio de venta(PV) = precio de compra(PC) + ganancia(G) + IVA
		BigDecimal g = new BigDecimal(10);
		BigDecimal iva = new BigDecimal(0.12);
		BigDecimal precio_venta = new BigDecimal(0);
		
		precio_venta = (p.getPrecio().add((p.getPrecio().multiply(g))).add((p.getPrecio().multiply(iva))));
		this.iInventarioService.ingresarInventario(p, cantidad, precio_venta, fecha);
	}

	@Override
	public List<Inventario> consultar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		List<Inventario> listaInventario = iInventarioRepository.consulta(fecha);
		List<Inventario> listaReporte = new ArrayList<>();
		for(Inventario i : listaInventario) {
			if (i.getFecha().isAfter(fecha) || i.getFecha().isEqual(fecha)) {
				listaReporte.add(i); 
			}
		}
		return listaReporte;
	}

	@Override
	public void reporte(List<Inventario> lista) {
		System.out.println("\n****\t\tReporte\t\t****");
		for(Inventario i : lista) {
			System.out.println(i);
		}
		System.out.println(".......................................................");
	}

}
