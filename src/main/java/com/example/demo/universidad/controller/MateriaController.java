package com.example.demo.universidad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.universidad.Service.IMateriaService;
import com.example.demo.universidad.modelo.Estudiante;
import com.example.demo.universidad.modelo.Materia;

@RequestMapping("/materias")
@Controller
public class MateriaController {
	
	@Autowired
	private IMateriaService iMateriaService;
	
	
	
	

	@GetMapping("/VistaInsertarMateria")
	public String VistaInsertarMateria(Materia materia) {
		
	return "vistaInsertarMateria";
		
	}
	
	
	
	@PostMapping("/insertarMateria")
	public String insertarEstudiante (Materia materia) {
		this.iMateriaService.insertar(materia);
		
		return "redirect:/materias/VistaInsertarMateria";

	}

}
