import java.util.Vector;

public class Vectores {
    /* Crea un "Vector" del tipo de dato que prefieras,y añádele 5 elementos.
       Elimina el 2o y 3er elemento y muestra el resultado final.
    */

    public static void main(String[] args) {

        //Creamos el vector "vector"
        Vector<Integer> vector = new Vector();

        //Añadimos 5 elementos al vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        //Eliminamos el 2º y 3º elemento (una vez eliminamos el 2º elemento, el 3º sera el 2º)
        vector.remove(1);
        vector.remove(1);

        //Mostramos el resultado final del vector
        System.out.println("Los datos del vector son: " + vector);

    }
}

        /* Indica cuál es el problema de utilizar un Vector con la capacidad
        por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        * EL problema es que la capacidad por defecto de un vector es de 10 valores, que aumentan
        de 10 en 10 cuando se supera la capacidad inicial. Esto supondría que el aumento de los
        10 valores iniciales a los 1000 elementos finales, haría que el array subyacente al vector
        aumentara la capacidad 100 veces pasando cada una de esas veces por el proceso costosísimo
        computacionalmente de copiarse a si mismo en un array más grande.  */


