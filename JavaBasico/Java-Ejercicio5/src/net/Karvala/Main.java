package net.Karvala;

public class Main {
    public static void main(String[] args) {
        // Crear objeto
        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        // Coches
        Coche fordMondeo = new Coche("Ford", "Mondeo", 5);
        Coche fiatPunto = new Coche("Fiat", "Punto", 3);
        Coche alfa147 = new Coche("Alfa Romeo", "147", 3);

        // Llamar a los métodos
        cocheCRUD.findAll();
        cocheCRUD.save(fiatPunto);
        cocheCRUD.delete(alfa147);
    }
}
