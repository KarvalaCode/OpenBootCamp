package net.karvala;

public class SmartPhone extends SmartDevice{

    //Atributos específicos SmartPhone
    String camaraDelantera;
    String camaraTrasera;
    int ram;

    //Constructor vacío
    public SmartPhone (){
    }

    //Constructor con los atributos SmartDevice + SmartPhone
    public SmartPhone(String marca, String modelo, String sistemaOperativo, String tamanoPantalla,
                       String resolucionPantalla, String camaraDelantera, String camaraTrasera, int ram) {
        super(marca, modelo, sistemaOperativo, tamanoPantalla, resolucionPantalla);
        this.camaraDelantera = camaraDelantera;
        this.camaraTrasera = camaraTrasera;
        this.ram = ram;

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tamanoPantalla='" + tamanoPantalla + '\'' +
                ", resolucionPantalla='" + resolucionPantalla + '\'' +
                ", camaraDelantera='" + camaraDelantera + '\'' +
                ", camaraTrasera='" + camaraTrasera + '\'' +
                ", ram=" + ram +
                '}';
    }
}

