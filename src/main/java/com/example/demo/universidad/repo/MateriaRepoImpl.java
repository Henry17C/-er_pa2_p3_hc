package com.example.demo.universidad.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.universidad.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MateriaRepoImpl implements IMateriaRepo{
	

	@PersistenceContext
	private EntityManager  entityManager;

	@Override
	public void insertar(Materia materia) {
		entityManager.persist(materia);
		
		
		
		
	}

	@Override
	public Materia buscarMateria(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Materia.class, id);
	}

	@Override
	public Materia buscarMateriaCodigo(String codigo) {
		// TODO Auto-generated method stub
		
		TypedQuery<Materia> query= this.entityManager.createQuery("select m from Materia m where m.codigo = :codigo ", Materia.class);
		query.setParameter("codigo", codigo);
		
		return query.getSingleResult();
	}

}
