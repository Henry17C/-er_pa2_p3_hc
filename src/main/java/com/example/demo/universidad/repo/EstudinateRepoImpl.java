package com.example.demo.universidad.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.universidad.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudinateRepoImpl  implements IEstudianteRepo{

	@PersistenceContext
	private EntityManager  entityManager;
	
	@Override
	public void insertar(Estudiante estu) {
		// TODO Auto-generated method stub
		entityManager.persist(estu);
	}

	@Override
	public List<Estudiante> listarEstudiantes() {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> query= this.entityManager.createQuery("select e from Estudiante e", Estudiante.class);
		
		
		return query.getResultList();
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		
		
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void Eliminar(Integer id) {
		// TODO Auto-generated method stub
		Estudiante estudiante=this.buscar(id);
		this.entityManager.remove(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
		
	}

	@Override
	public Estudiante buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		
		
		TypedQuery<Estudiante> query= this.entityManager.createQuery("select e from Estudiante e where e.cedula= :cedula", Estudiante.class);
		query.setParameter("cedula", cedula);
		
		return query.getSingleResult();
	}
	
	
	
	
	
	

}
