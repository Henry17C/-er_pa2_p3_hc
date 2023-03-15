package com.example.demo.universidad.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mate_seq")//generarlo como secuencia
	@SequenceGenerator(name = "mate_seq", sequenceName = "mate_seq", allocationSize = 1)
	@Column(name = "mate_id")
	private Integer id;

	@Column(name = "mate_nombre")
	private String nombre;

	@Column(name = "mate_codigo")
	private String  codigo;

	@Column(name = "mate_descripcion")
	private String  descripcion;

	@Column(name = "mate_numCreditos")
	private Integer numCreditos;
	
	@Column(name = "mate_numEstudiantes")
	private Integer numEstudiantes;
	
	
	@OneToMany(mappedBy = "materia")
	private List<Matricula> matricula;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Integer getNumCreditos() {
		return numCreditos;
	}


	public void setNumCreditos(Integer numCreditos) {
		this.numCreditos = numCreditos;
	}


	public Integer getNumEstudiantes() {
		return numEstudiantes;
	}


	public void setNumEstudiantes(Integer numEstudiantes) {
		this.numEstudiantes = numEstudiantes;
	}
	
	

}
