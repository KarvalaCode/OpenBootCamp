package com.example.SpringEjercicio4.controllers;

import com.example.SpringEjercicio4.entities.Laptop;
import com.example.SpringEjercicio4.repositories.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    //Atributo repository para añadirlo a esta clase desde el constructor
    private LaptopRepository repositorio;

    //Constructor
    public LaptopController(LaptopRepository repositorio) {
        this.repositorio = repositorio;
    }

    //Buscar portátiles
    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return repositorio.findAll();
    }

    //Buscar portatil por id
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id) {
        Optional<Laptop> laptopOpt = repositorio.findById(id);
        if (laptopOpt.isPresent()) {
            return ResponseEntity.ok(laptopOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //Crear portátil
    @PostMapping("/api/laptops")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers) {
        System.out.println(headers.get("User-Agent)"));
        if (laptop.getId() != null) {
            return ResponseEntity.badRequest().build();
        }
        Laptop resultado = repositorio.save(laptop);
        return ResponseEntity.ok(resultado);
    }
    //Actualizar portátil
    @PutMapping("api/laptops")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop){
        if (laptop.getId() == null) {
            return ResponseEntity.badRequest().build();
        }
        if (!repositorio.existsById(laptop.getId()))  {
            return ResponseEntity.notFound().build();

        }
        Laptop resultado = repositorio.save(laptop);
        return ResponseEntity.ok(resultado);
    }

    //Eliminar portátil por id
    @DeleteMapping("api/laptops/{id}")
    public ResponseEntity<Laptop> delete(@PathVariable Long id){
        if(!repositorio.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        repositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    //Eliminar todos los portátiles
    @DeleteMapping("api/laptops")
    public ResponseEntity<Laptop> deleteAll(){
        repositorio.deleteAll();
        return ResponseEntity.noContent().build();
    }
}