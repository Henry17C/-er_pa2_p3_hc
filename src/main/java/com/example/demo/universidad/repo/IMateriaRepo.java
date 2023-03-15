package com.example.demo.universidad.repo;

import com.example.demo.universidad.modelo.Materia;

public interface IMateriaRepo {
	
	
	public void insertar(Materia materia);
	
	
	public Materia buscarMateria(Integer id);
	
	public Materia buscarMateriaCodigo(String codigo);
	
	
	
	

}
