package com.example.peliculas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.peliculas.dao.ISalaDAO;
import com.example.peliculas.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService{
	@Autowired
    private ISalaDAO iSalaDAO;

    @Override
    public List<Sala> listarSalas() {
        return iSalaDAO.findAll();
    }

    @Override
    public Sala obtenerSalaPorId(Integer id) {
    	return iSalaDAO.findById(id).get();
    }

    @Override
    public Sala guardarSala(Sala Sala) {
        return iSalaDAO.save(Sala);
    };


    @Override
    public Sala actualizarSala(Sala Sala) {
    	return iSalaDAO.save(Sala);
    }

    @Override
    public void eliminarSala(Integer id) {
    	iSalaDAO.deleteById(id);
    }
}
