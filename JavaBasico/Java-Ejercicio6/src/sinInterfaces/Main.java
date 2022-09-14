package sinInterfaces;

import java.util.List;

public class Main {

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


    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado sara = new Empleado("Sara", 39, 70000, false);
        Empleado patricia = new Empleado("Patricia", 39, 70000, false);
        Empleado juanito = new Empleado("Juanito", 39, 70000, false);
        Empleado alan = new Empleado("Alan", 39, 70000, false);

       // Guardar empleados
       empleadoCRUD.save(sara);
       empleadoCRUD.save(patricia);
       empleadoCRUD.save(juanito);
       empleadoCRUD.save(alan);

       // Consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }






        }
