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

import com.example.peliculas.dto.Pelicula;
import com.example.peliculas.services.PeliculaServiceImpl;

@RestController
@RequestMapping("/pelicula")
public class PeliculaController {
	@Autowired
	private PeliculaServiceImpl PeliculaServiceImpl;
	@GetMapping("/all")
    public List<Pelicula> getPelicula() {
        return PeliculaServiceImpl.listarPeliculaes();
    }

    @GetMapping("/{id}")
	public Pelicula PeliculaXID(@PathVariable(name="id") Integer id) {
    	Pelicula Pelicula_xid= new Pelicula();
		Pelicula_xid=PeliculaServiceImpl.obtenerPeliculaPorId(id);
		System.out.println("Pelicula XID: "+Pelicula_xid);
		return Pelicula_xid;
	}
    @PostMapping("/add")
	public Pelicula salvarPelicula(@RequestBody Pelicula Pelicula) {
		return PeliculaServiceImpl.guardarPelicula(Pelicula);
	}

    @PutMapping("/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name="id")Integer id,@RequestBody Pelicula Pelicula) {
    	Pelicula Pelicula_seleccionado= new Pelicula();
    	Pelicula Pelicula_actualizado= new Pelicula();
		
		Pelicula_seleccionado= PeliculaServiceImpl.obtenerPeliculaPorId(id);
		Pelicula_seleccionado.setNombre(Pelicula.getNombre());
		Pelicula_seleccionado.setCalificacion_edad(Pelicula.getCalificacion_edad());
		Pelicula_seleccionado.setSala(Pelicula.getSala());

		Pelicula_actualizado = PeliculaServiceImpl.actualizarPelicula(Pelicula_seleccionado);
		
		System.out.println("El Pelicula actualizado es: "+ Pelicula_actualizado);
		
		return Pelicula_actualizado;
    }

    @DeleteMapping("/{id}")
    public void eliminarPelicula(@PathVariable int id) {
    	PeliculaServiceImpl.eliminarPelicula(id);
		System.out.println("Pelicula eliminado");

    }
}
