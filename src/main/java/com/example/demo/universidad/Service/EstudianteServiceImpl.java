package com.example.demo.universidad.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.universidad.modelo.Estudiante;
import com.example.demo.universidad.repo.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepo estudianteRepo;
	
	@Override
	public void insertar(Estudiante estu) {
		// TODO Auto-generated method stub
		estudianteRepo.insertar(estu);
	}

	@Override
	public List<Estudiante> listarEstudiantes() {
		// TODO Auto-generated method stub
		return estudianteRepo.listarEstudiantes();
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return estudianteRepo.buscar(id);
	}

	@Override
	public void Eliminar(Integer id) {
		// TODO Auto-generated method stub
		estudianteRepo.Eliminar(id);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		estudianteRepo.actualizar(estudiante);
	}

	@Override
	public Estudiante buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.buscarCedula(cedula);
	}

}
