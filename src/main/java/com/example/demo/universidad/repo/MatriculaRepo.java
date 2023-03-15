package com.example.demo.universidad.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.universidad.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class MatriculaRepo implements IMatriculaRepository {

	

	@PersistenceContext
	private EntityManager  entityManager;
	@Override
	public void insertaMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		
		entityManager.persist(matricula);
		
	}
	
	
	
	
	

}
