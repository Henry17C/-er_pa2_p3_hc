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

@Table(name = "estudiante")
@Entity
public class Estudiante {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_seq")//generarlo como secuencia
	@SequenceGenerator(name = "estu_seq", sequenceName = "estu_seq", allocationSize = 1)
	@Column(name = "estu_id")
	private Integer id;

	@Column(name = "estu_nombre")
	private String nombre;

	@Column(name = "estu_apellido")
	private String  apellido;

	@Column(name = "estu_cedula")
	private String  cedula;

	@Column(name = "estu_genero")
	private String genero;
	
	@OneToMany(mappedBy = "estudiante")
	private  List<Matricula> matricula;

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	

	
	

}
