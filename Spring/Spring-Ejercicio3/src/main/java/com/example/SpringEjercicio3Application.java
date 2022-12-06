package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringEjercicio3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringEjercicio3Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);

		//System.out.println("El número de usuarios en la base de datos es: " + repository.count());

		// crear y almacenar un usuario en la base de datos
		User sara = new User(null, "Sara", "Gómez");
		repository.save(sara);

		System.out.println("El número de usuarios en la base de datos es: " + repository.count());

		// recuperar todos
		System.out.println(repository.findAll());
	}
}
