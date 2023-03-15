package com.example.demo.universidad.repo;

import java.util.List;

import com.example.demo.universidad.modelo.Estudiante;

public interface IEstudianteRepo {
	
	//inseratr
	public void insertar(Estudiante estu );
	
	//mostrar todos
	
	public List<Estudiante> listarEstudiantes();
	//eliminar
	
	
	public Estudiante buscar(Integer id);
	
	
	public void Eliminar(Integer id);
	
	public void actualizar(Estudiante estudiante);
	
	public Estudiante buscarCedula(String cedula);

}
