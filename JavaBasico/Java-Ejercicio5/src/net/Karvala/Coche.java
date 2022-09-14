package net.Karvala;

public class Coche {
    //Atributos
    String marca;
    String modelo;
    int puertas;


    //Constructores: Vacío + con atributos

    public Coche() {}

    public Coche(String modelo, String marca, int puertas) {
        this.modelo = modelo;
        this.marca = marca;
        this.puertas = puertas;
    }

    //Método toString para imprimir los atributos por pantalla
    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
