package com.example.peliculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.peliculas.dto.Sala;

public interface ISalaDAO extends JpaRepository<Sala,Integer>{

}
