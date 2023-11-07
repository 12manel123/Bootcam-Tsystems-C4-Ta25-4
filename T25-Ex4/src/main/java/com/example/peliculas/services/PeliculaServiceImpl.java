package com.example.peliculas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.peliculas.dao.IPeliculaDAO;
import com.example.peliculas.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService{
	@Autowired
    private IPeliculaDAO iPeliculaDAO;

    @Override
    public List<Pelicula> listarPeliculaes() {
        return iPeliculaDAO.findAll();
    }

    @Override
    public Pelicula obtenerPeliculaPorId(Integer id) {
    	return iPeliculaDAO.findById(id).get();
    }

    @Override
    public Pelicula guardarPelicula(Pelicula Pelicula) {
        return iPeliculaDAO.save(Pelicula);
    };


    @Override
    public Pelicula actualizarPelicula(Pelicula Pelicula) {
    	return iPeliculaDAO.save(Pelicula);
    }

    @Override
    public void eliminarPelicula(Integer id) {
    	iPeliculaDAO.deleteById(id);
    }
}
