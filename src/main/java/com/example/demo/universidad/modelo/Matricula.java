package com.example.demo.universidad.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Table(name = "matricula")
@Entity
public class Matricula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matri_seq")//generarlo como secuencia
	@SequenceGenerator(name = "matri_seq", sequenceName = "matri_seq", allocationSize = 1)
	@Column(name = "matri_id")
	private Integer id;
	
	
	@ManyToOne
	@JoinColumn(name="id_estudiante")
	private Estudiante estudiante;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Estudiante getEstudiante() {
		return estudiante;
	}


	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}


	public Materia getMateria() {
		return materia;
	}


	public void setMateria(Materia materia) {
		this.materia = materia;
	}


	@ManyToOne
	@JoinColumn(name="id_materia")
	private Materia materia;
	
	

}
