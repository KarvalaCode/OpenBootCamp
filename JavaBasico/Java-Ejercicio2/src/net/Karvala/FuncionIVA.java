package net.Karvala;

public class FuncionIVA {

    public static void main(String[] args) {

        //Invocar a la función que añade el IVA aportando los precios base

        funcionIVA(55.23);
        funcionIVA(134.42);
        funcionIVA(100);
        funcionIVA(33642.15);
        funcionIVA(645.08);
        funcionIVA(752.16);
        funcionIVA(0);

    }

    //Función que imprime el precio con un 21% de IVA

    static void funcionIVA(double precio) {

        double precioIVA = precio + precio * 0.21;

        System.out.println("El precio con IVA de " + precio + "€ es " + precioIVA + "€");

    }

}
