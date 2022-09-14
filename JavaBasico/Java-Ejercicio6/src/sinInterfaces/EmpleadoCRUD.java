package sinInterfaces;

import java.util.ArrayList;
import java.util.List;
       /* CRUD:
        * Create
        * Retriev / Read
        * Update
        * Delete
        */
public class EmpleadoCRUD {
    // Estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

    //Operaciones CRUD
        // CREATE - guardar un empleado
        public void save(Empleado empleado){
            empleados.add(empleado);
    }
        //RETRIEVE - recuperar empleado
        public List<Empleado> findAll(){
            return empleados;
        }

}
