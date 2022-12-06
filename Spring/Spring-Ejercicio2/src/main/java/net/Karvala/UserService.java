package net.Karvala;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    //Atributo de Notification Service
    NotificationService notificacion;

    //Constructor
    public UserService(NotificationService notificacion){
        System.out.println("Ejecutando constructor UserService");
        this.notificacion = notificacion;
    }
}
