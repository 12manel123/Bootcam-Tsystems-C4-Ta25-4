package com.example.peliculas.services;

import java.util.List;

import com.example.peliculas.dto.Sala;

public interface ISalaService {
public List<Sala> listarSalas();
	
	//Listar por id
	public Sala obtenerSalaPorId(Integer id);

    // Guardar
    public Sala guardarSala(Sala Sala);

    // Actualizar
    public Sala actualizarSala(Sala Sala);

    // Eliminar
    public void eliminarSala(Integer id);
}
