package com.example.peliculas.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Salas")
public class Sala {
	@Id
	@Column(name = "codigo")
	private int id;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "pelicula")
	private Pelicula pelicula;

	public Sala() {
	}

	public Sala(int id, String nombre, Pelicula pelicula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pelicula = pelicula;
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

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
	    return "Sala [id=" + id + ", nombre=" + nombre + "]";
	}
	

	

	
	
	
	

}
