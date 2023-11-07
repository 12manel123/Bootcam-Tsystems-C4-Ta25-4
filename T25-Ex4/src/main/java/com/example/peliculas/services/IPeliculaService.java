package com.example.peliculas.services;

import java.util.List;

import com.example.peliculas.dto.Pelicula;

public interface IPeliculaService {
	//Listar todos
			public List<Pelicula> listarPeliculaes();
			
			//Listar por id
			public Pelicula obtenerPeliculaPorId(Integer id);

		    // Guardar
		    public Pelicula guardarPelicula(Pelicula Pelicula);

		    // Actualizar
		    public Pelicula actualizarPelicula(Pelicula Pelicula);

		    // Eliminar
		    public void eliminarPelicula(Integer id);
}
