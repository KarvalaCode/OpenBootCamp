import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class programaMascotas {

    /* Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones,
       un HashMap y un ArrayList, LinkedList o array.
     */

    /**
     * Programa que lee un archivo, lo convierte en un HashMap y devuelve los valores en forma de ArrayList en otro archivo.
     * Se recibe un archivo con dos campos en cada registro (tipo de animal de companyia : nombre del animal).
     * Se crea un HashMap que asocia los dos campos de cada registro del archivo entre si.
     * Se crea un ArrayList únicamente con los valores del HashMap y se escribe en un nuevo archivo.
     *
     * (En vez de utilizar InputStream y PrintStream, se ha usado FileReader y FileWriter para leer/escribir
     * los carácteres del archivo en vez de los bytes).
     *
     * 8
     * @param args
     */

    public static void main(String[] args) {

        //Creamos el HashMap
        Map<String, String> mascotas = new HashMap<>();

        try {

            //Leemos el archivo y rellenamos el HashMap con su contenido
            String linea;
            FileReader archivo = new FileReader("mascotas.txt");
            BufferedReader archivoBuffer = new BufferedReader(archivo);
            while ((linea = archivoBuffer.readLine()) != null) {
                String[] valor = linea.split(":");
                String animal = valor[0];
                String nombre = valor[1];
                System.out.println("Animal es: " + animal + " y su nombre es: " + nombre);

                mascotas.put(animal, nombre);
                System.out.println(mascotas);
            }

            archivoBuffer.close();

        //Capturamos qualquier excepción que se pueda producir
        } catch (Exception e) {
            System.out.println("Problema en el Input: " + e.getMessage());
        }

        //Creamos el ArrayList
        List<String> nombreMascotas = new ArrayList<>();

        try {

            //Rellenamos el ArrayList con los valores del HashMap
            for (Map.Entry<String, String> dato : mascotas.entrySet()) {
                String nombre = dato.getValue();
                nombreMascotas.add(nombre);
                System.out.println(nombreMascotas);
            }

            //Escribimos un nuevo archivo con los elementos del ArrayList
            String nombreDeLasMascotas = "";
            for (String nombre : nombreMascotas) {
                nombreDeLasMascotas += nombre + ",";
                System.out.println(nombreDeLasMascotas);
            }
            FileWriter archivo = new FileWriter("nombreMascotas.txt", true);
            BufferedWriter bufferedArchivo = new BufferedWriter(archivo);

            bufferedArchivo.write(nombreDeLasMascotas);
            bufferedArchivo.close();

         //Capturamos qualquier excepción que se pueda producir
        } catch (Exception e) {
            System.out.println("Problema en el Output: " + e.getMessage());
        }
    }
}
