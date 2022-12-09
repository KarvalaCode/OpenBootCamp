package com.example.SpringEjercicio4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/* 1. Crear un proyecto Spring Boot con las dependencias:
		H2
		Spring Data JPA
		Spring Web
		Spring Boot dev tools

	Crear una clase HelloController que sea un controlador REST.
	Dentro de la clase crear un método que retorne un saludo.
	Probar que retorna el saludo desde el navegador y desde Postman.

  2. Dentro de la misma app crear las clases necesarias para trabajar con "ordenadores":
		Laptop (entidad)
		LaptopRepository (repositorio)
		LaptopController (controlador)
	Desde LaptopController crear un método que devuelva una lista de objetos Laptop.
	Probar que funciona desde Postman.
	Los objetos Laptop se pueden insertar desde el método main de la clase principal.

  3. Crear un método en LaptopController que reciba un objeto Laptop enviado en formato JSON
   desde Postman y persistirlo en la base de datos.
	Comprobar que al obtener de nuevo los laptops aparece el nuevo ordenador creado.
 */

@SpringBootApplication
public class SpringEjercicio4Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringEjercicio4Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		//Crear portátiles
		Laptop l1 = new Laptop(null, "MSI", 64, "Windows");
		Laptop l2 = new Laptop(null, "Apple", 32, "Mac OS");
		Laptop l3 = new Laptop(null, "Acer", 32, "Windows");

		//Guardar portátiles
		repository.save(l1);
		repository.save(l2);
		repository.save(l3);

		System.out.println(repository.count());

		
	}
}
