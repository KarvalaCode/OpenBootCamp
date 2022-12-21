package com.example.SpringEjercicio4;

import com.example.SpringEjercicio4.entities.Laptop;
import com.example.SpringEjercicio4.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/* Ejercicio 1. Implementar los métodos CRUD en el API REST de Laptop.

	Los métodos CRUD:

		findAll()
		findOneById()
		create()
		update()
		delete()
		deleteAll()

  Ejercicio 2. Implementar swagger sobre el API REST de Laptop y verificar que funciona en la URL:
  http://localhost:8081/swagger-ui/

  Ejercicio 3. Crear casos de test para el controlador de Laptop desde Spring Boot.
  Crear la clase con todos los tests unitarios e implementarlos siguiendo el proceso visto en clase.
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
