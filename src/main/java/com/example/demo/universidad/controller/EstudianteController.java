package com.example.demo.universidad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.universidad.Service.IEstudianteService;
import com.example.demo.universidad.modelo.Estudiante;

@RequestMapping("/estudiantes")
@Controller
public class EstudianteController {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	
	
	@GetMapping("/VistaInsertarEstudiante")
	public String VistaInsertarEstudiante(Estudiante estudiante) {
		
	return "vistaInsertarEstudiante";
		
	}
	
	
	@PostMapping("/insertarEstudiante")
	public String insertarEstudiante (Estudiante estudiante) {
		this.estudianteService.insertar(estudiante);
		
		return "redirect:/estudiantes/vistaListarEstdiantes";

	}
	
	
	
	
	@GetMapping("/vistaListarEstdiantes")
	public String verListaEstudiantes(Model model) {
		List<Estudiante> estudiantes= this.estudianteService.listarEstudiantes();
		model.addAttribute("estudiantes", estudiantes);
		return "vistaListaEstudiantes";
		
	}
	
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id")Integer id){
		this.estudianteService.Eliminar(id);
		
		return "redirect:/estudiantes/vistaListarEstdiantes";
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
