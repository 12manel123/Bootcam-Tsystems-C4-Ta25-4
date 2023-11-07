package com.example.peliculas.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Pelicula {
	@Id
	@Column(name = "codigo")
	private int id;
	private String nombre;
	@Column(name = "calificacion_edad")
	private int calificacion_edad;
	public Pelicula() {
	}

	public Pelicula(int id, String nombre, int calificacion_edad, List<Sala> sala) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.calificacion_edad = calificacion_edad;
		this.sala = sala;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCalificacion_edad() {
		return calificacion_edad;
	}

	public void setCalificacion_edad(int calificacion_edad) {
		this.calificacion_edad = calificacion_edad;
	}


	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}
	
	@Override
	public String toString() {
	    return "Pelicula [id=" + id + ", nombre=" + nombre + ", calificacion_edad=" + calificacion_edad + "]";
	}

	@OneToMany(mappedBy = "pelicula")
	private List<Sala> sala;
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, mappedBy="Sala")
	public List<Sala> getSala(){
		return sala;
	}
	
	

	
	
}
