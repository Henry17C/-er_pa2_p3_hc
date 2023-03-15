package com.example.demo.universidad.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.universidad.modelo.Estudiante;
import com.example.demo.universidad.modelo.EstudianteTmp;
import com.example.demo.universidad.modelo.Materia;
import com.example.demo.universidad.modelo.Matricula;
import com.example.demo.universidad.repo.IMateriaRepo;
import com.example.demo.universidad.repo.IMatriculaRepository;
@Service
public class MatriculaServiceImpl implements IMatriculaService{
 public static int n=0;
	
	@Autowired
	private IMateriaService iMateriaService;
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Override
	public void insertaMatricula(EstudianteTmp estudianteTmp) {
	
	//Materia materia=this.iMateriaService. ;
		Materia materia=this.iMateriaService.buscarMateriaCodigo(estudianteTmp.getCodMateria());
		Estudiante Estudiante=this.estudianteService.buscarCedula(estudianteTmp.getCedula());
		Matricula matricula= new Matricula();
		
		matricula.setEstudiante(Estudiante);
		matricula.setMateria(materia);
		iMatriculaRepository.insertaMatricula(matricula);
		materia.setNumEstudiantes(n);
		
		n++;
		
		
	}
	
	
	
	

}
