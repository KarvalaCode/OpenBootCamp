package net.karvala;

public class Main {

    public static void main(String[] args) {


    //Crear objetos
    SmartDevice smartDevice1 = new SmartDevice("Iphone", "13", "iOS", "6.1", "2.532 x 1.170" );

    SmartPhone smartPhone1 = new SmartPhone("OPPO", "A9", "Android", "6.5", "1.600 x 720", "16 MP f/2.0", "48 MP f/1.8", 8);

    SmartWatch smartWatch1 = new SmartWatch("Xiaomi", "Mi Watch", "Android", "1.9", "454 x 454", "5ATM", "TPU", "frecuencia cardiaca, aceleración, giroscopio, geomagnético y presión atmosférica");

    //Imprimir valores objetos por consola

        System.out.println(smartDevice1);

        System.out.println(smartPhone1);

        System.out.println(smartWatch1);
    }

}
