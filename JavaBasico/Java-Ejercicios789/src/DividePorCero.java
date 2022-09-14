import java.util.Scanner;

public class DividePorCero {

    /* Crea una función DividePorCero.
       Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
       que será capturada por su llamante (desde "main", por ejemplo).
       Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
       Finalmente, mostraremos en cualquier caso: "Demo de código".
    */

    public static void main(String[] args) {
        dividePorCero();
    }

    //Creamos la función dividePorCero que genera una ArithmeticException
    // que muestra el mensaje "Esto no puede hacerse" y "Demo de código" en cualquier caso.
    static void dividePorCero() throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números");

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        try {
            int resultado = numA / numB;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

    }
}

