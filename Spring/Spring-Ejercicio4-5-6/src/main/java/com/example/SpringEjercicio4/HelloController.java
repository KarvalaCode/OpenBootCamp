package com.example.SpringEjercicio4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hola")
    public String Hola(){
        return "Hola mundo, probando Spring Boot";
    }
}
