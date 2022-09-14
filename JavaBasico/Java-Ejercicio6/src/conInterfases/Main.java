package conInterfases;

/*Interfaz CocheCRUD.

        - implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
        - métodos de CocheCRUD (que impriman por consola el nombre del propio método):
            save()
            findAll()
            delete()
        - clase Main, Crear objeto CocheCRUDImpl y llamar a cada uno de los métodos.
            Ejemplo: CocheCRUD cocheCrud = new CocheCRUDImpl()
    CRUD:
        * Create
        * Retriev / Read

     */
public class Main {

    public static void main(String[] args) {
        // Crar objeto
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
