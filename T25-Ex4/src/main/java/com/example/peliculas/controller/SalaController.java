package com.example.peliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.peliculas.dto.Sala;
import com.example.peliculas.services.SalaServiceImpl;

@RestController
@RequestMapping("/sala")
public class SalaController {
	@Autowired
	private SalaServiceImpl SalaServiceImpl;

    @GetMapping("/all")
    public List<Sala> getSala() {
        return SalaServiceImpl.listarSalas();
    }

    @GetMapping("/{id}")
	public Sala SalaXID(@PathVariable(name="id") Integer id) {
    	Sala Sala_xid= new Sala();
    	Sala_xid=SalaServiceImpl.obtenerSalaPorId(id);
		System.out.println("Sala XID: "+Sala_xid);
		return Sala_xid;
	}
    @PostMapping("/add")
	public Sala salvarSala(@RequestBody Sala Sala) {
		return SalaServiceImpl.guardarSala(Sala);
	}

    @PutMapping("/{id}")
	public Sala actualizarSala(@PathVariable(name="id")Integer id,@RequestBody Sala Sala) {
    	Sala Sala_seleccionado= new Sala();
		
    	Sala_seleccionado= SalaServiceImpl.obtenerSalaPorId(id);
		
    	Sala_seleccionado.setNombre(Sala.getNombre());
    	Sala_seleccionado.setPelicula(Sala.getPelicula());
		
    	Sala_seleccionado = SalaServiceImpl.actualizarSala(Sala_seleccionado);
		
		System.out.println("La Sala actualizada es: "+ Sala_seleccionado);
		
		return Sala_seleccionado;
    }

    @DeleteMapping("/{id}")
    public void eliminarSala(@PathVariable Integer id) {
    	SalaServiceImpl.eliminarSala(id);
		System.out.println("Sala eliminada");
    }
}
