package com.example.demo.universidad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.universidad.Service.IMatriculaService;
import com.example.demo.universidad.modelo.EstudianteTmp;
import com.example.demo.universidad.modelo.Materia;
import com.example.demo.universidad.modelo.Matricula;

@RequestMapping("/matriculas")
@Controller
public class MatriculasController {

	@Autowired
	private IMatriculaService iMatriculaService;
	

	@GetMapping("/VistaInsertarMateria")
	public String VistaInsertarMateria(Materia materia) {
		
	return "VistaIngreSarEstudianteMatricula";
		
	}
	
	
	
	@PostMapping("/insertarMateria")
	public String insertarEstudiante (EstudianteTmp matricula) {
		this.iMatriculaService.insertaMatricula(matricula);
		
		return "redirect:/materias/VistaInsertarMateria";

	}
}
