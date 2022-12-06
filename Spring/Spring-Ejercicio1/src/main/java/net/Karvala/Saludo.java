package net.Karvala;
/* Ejercicio 1

Crear proyecto maven con la dependencia spring-context y crear una clase net.Karvala.Saludo con un método imprimirSaludo que imprima un texto por consola.

Crear el archivo beans.xml con un bean para la clase net.Karvala.Saludo.

Obtener el bean desde el método main y ejecutar el método imprimirSaludo. */



public class Saludo {

    public static String imprimirSaludo() {
        return "Saludos desde Spring";
    }



}
