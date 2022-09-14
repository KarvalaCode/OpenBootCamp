package sinInterfaces;

public class Empleado{

   // Atributos
    String nombre;
    int edad;
    double salario;
    boolean alta;

   //Constructores

    public void Empelado(){}    //Vacío

        public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;

    }

    //Métodos
    /* Método toString para imprimir por consola los atrubutos de los objetos.
    Sin este método al hacer System.out.println() se imprimen las referencias en memoria.
     */

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
