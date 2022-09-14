package net.karvala;

public class SmartDevice {

    //Atributos generales
    String marca;
    String modelo;
    String sistemaOperativo;
    String tamanoPantalla;
    String resolucionPantalla;

    //Constructor vacío
    public SmartDevice (){
    }

    //Constructor con los atributos de SmartDevice
    public SmartDevice(String marca, String modelo, String sistemaOperativo, String tamanoPantalla,
    String resolucionPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.resolucionPantalla = resolucionPantalla;

    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tamanoPantalla='" + tamanoPantalla + '\'' +
                ", resolucionPantalla='" + resolucionPantalla + '\'' +
                '}';
    }
}
