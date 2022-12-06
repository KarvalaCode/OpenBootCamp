package net.Karvala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");

        Saludo saludo = (Saludo) container.getBean("saludo");

        System.out.println(saludo.imprimirSaludo());


    }
}
