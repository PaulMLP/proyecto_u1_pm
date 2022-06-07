package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1PmApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IMateriaService materiaService;

	@Autowired
	private IMatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// CRUD de estudiante
		// Create
		Estudiante e = new Estudiante();
		e.setNombre("Paul");
		e.setApellido("Merizalde");
		e.setCedula("1728189521");
		this.estudianteService.ingresarEstudiante(e);

		// Update
		e.setCedula("1728189522");
		this.estudianteService.actualizarEstudiante(e);

		// Read
		this.estudianteService.buscarPorApellido("Merizalde");

		// Delete
		this.estudianteService.borrarEstudiante("17281895212");

		// CRUD de Materia
		// Create
		Materia m = new Materia();
		m.setNombre("Programacion Avanzada");
		m.setSemestre("6");
		this.materiaService.ingresarMateria(m);

		// Update
		m.setSemestre("5");
		this.materiaService.actualizarMateria(m);

		// Read
		this.materiaService.buscarPorNombre("Programacion Avanzada");

		// Delete
		this.materiaService.borrarMateria("Programacion Avanzada");

		// CRUD de Matricula
		// Create
		Matricula mtr = new Matricula();

		// creamos lista de materia
		List<Materia> lista = new ArrayList<Materia>();
		lista.add(m);

		mtr.setNumero("092310930123");
		mtr.setEstudiante(e);
		mtr.setMateria(lista);
		this.matriculaService.ingresarMatricula(mtr);

		// Update
		mtr.setNumero("02030230138");
		this.matriculaService.actualizarMatricula(mtr);

		// Read
		this.matriculaService.buscarPorNumero("02030230138");

		// Delete
		this.matriculaService.borrarMatricula("02030230138");

	}

}
