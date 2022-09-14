import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Stream {

    /* Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
     La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
     */

    public static void main(String[] args) {

        try {
            InputStream fileIn = new FileInputStream("retopodcast.jpg"); // creamos el input

            byte[] datos = fileIn.readAllBytes(); // creamos el array dónde guardar los datos leídos

            //Recorremos los datos leídos
            for (byte dato : datos) {
                System.out.print(dato);
            }

            //cerramos en fichero
            fileIn.close();

            PrintStream fileOut = new PrintStream ("copiaFichero.txt"); // Creamos el fichero de salida

            fileOut.write(datos); // Escribimos el fichero con los bytes en datos

            fileOut.close(); // Cerramos el fichero

        } catch (Exception e){
            System.out.println("Ka pasao: "+ e.getMessage()); // Capturamos cualquier excepción
        }
    }
}
