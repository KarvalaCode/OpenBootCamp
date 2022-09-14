package net.karvala;

public class SmartWatch extends SmartDevice{

    //Atributo específicos del SmartWatch
    String resistenciaH2O;
    String correa;
    String sensores;

    //Constructor vacío
    public SmartWatch (){
    }


    //Constructor con los atributos SmartDevice + SmartWatch
    public SmartWatch(String marca, String modelo, String sistemaOperativo, String tamanoPantalla,
                       String resolucionPantalla, String resistenciaH2O, String correa, String sensores) {
        super(marca, modelo, sistemaOperativo, tamanoPantalla, resolucionPantalla);
        this.resistenciaH2O = resistenciaH2O;
        this.correa = correa;
        this.sensores = sensores;


    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tamanoPantalla='" + tamanoPantalla + '\'' +
                ", resolucionPantalla='" + resolucionPantalla + '\'' +
                ", resistenciaH2O='" + resistenciaH2O + '\'' +
                ", correa='" + correa + '\'' +
                ", sensores='" + sensores + '\'' +
                '}';
    }
}
