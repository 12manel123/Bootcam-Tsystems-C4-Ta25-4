package com.example.peliculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.peliculas.dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula,Integer>{

}
