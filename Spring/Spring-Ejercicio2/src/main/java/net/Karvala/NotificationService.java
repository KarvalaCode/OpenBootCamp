package net.Karvala;

/* Ejercicio 2

Crear la clase NotificationService, con un método que imprima un saludo.

Crear una clase UserService que tenga un atributo de clase NotificationService.

Utilizar la anotación @Component en cada clase.

Habilitar el escaneo de clases en el archivo beans.xml

Desde el método main, probar a obtener el bean UserService y ejecutar el método imprimirSaludo que tiene asociado el atributo de tipo NotificationService.

De forma similar a la realizada en clase. */

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService(){
        System.out.println("Ejecutando constructor NotificationService");
    }

    public String saludar() {
        return "Saludo desde NotificationService";
    }
}
