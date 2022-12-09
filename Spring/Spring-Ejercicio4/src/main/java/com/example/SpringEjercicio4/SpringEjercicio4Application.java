package com.example.SpringEjercicio4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* Crear un proyecto Spring Boot con las dependencias:
	H2
	Spring Data JPA
	Spring Web
	Spring Boot dev tools

Crear una clase HelloController que sea un controlador REST.
Dentro de la clase crear un método que retorne un saludo.
Probar que retorna el saludo desde el navegador y desde Postman.
 */

@SpringBootApplication
public class SpringEjercicio4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEjercicio4Application.class, args);
	}

}
