package com.example.demo.universidad.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.universidad.modelo.Materia;
import com.example.demo.universidad.repo.IMateriaRepo;

@Service

public class MateriaServiceImpl implements IMateriaService {
	
	
	@Autowired
	private IMateriaRepo iMateriaRepo;

	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		
		iMateriaRepo.insertar(materia);
		
	}

	@Override
	public Materia buscarMateria(Integer id) {
		
		return this.buscarMateria(id);
	}

	@Override
	public Materia buscarMateriaCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.iMateriaRepo.buscarMateriaCodigo(codigo);
	}

}
