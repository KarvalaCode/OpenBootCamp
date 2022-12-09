package com.example.SpringEjercicio4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {
    //Atributo repository para añadirlo a esta clase desde el constructor
    private LaptopRepository repositorio;

    //Constructor
    public LaptopController(LaptopRepository repositorio) {this.repositorio = repositorio;}

    //Buscar portátiles
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return repositorio.findAll();
    }

    //Crear Libro (POST)
    @PostMapping("/api/laptops")
    public Laptop post(@RequestBody Laptop laptop) {
        return repositorio.save(laptop);
    }
}
