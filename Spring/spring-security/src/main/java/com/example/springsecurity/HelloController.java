package com.example.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String hola() {
        return "Hola mundo, bienvenida";
    }

    @GetMapping("/user")
    public String user() {
        return "Hola user";
    }

}


