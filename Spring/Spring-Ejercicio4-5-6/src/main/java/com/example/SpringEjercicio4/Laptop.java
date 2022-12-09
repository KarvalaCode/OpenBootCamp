package com.example.SpringEjercicio4;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {

        //Atributos
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String Marca;
        private Integer RAM;
        private String OS;

        //Constructores

    public Laptop() {}
    public Laptop(Long id, String marca, Integer RAM, String OS) {
        this.id = id;
        Marca = marca;
        this.RAM = RAM;
        this.OS = OS;}

    //Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    //toString para imprimir

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", Marca='" + Marca + '\'' +
                ", RAM=" + RAM +
                ", OS='" + OS + '\'' +
                '}';
    }
}
