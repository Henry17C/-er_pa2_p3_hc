package com.example.demo.universidad.Service;

import com.example.demo.universidad.modelo.Materia;

public interface IMateriaService {
	public void insertar(Materia materia);
	
	public Materia buscarMateria(Integer id);
	public Materia buscarMateriaCodigo(String codigo);



}
