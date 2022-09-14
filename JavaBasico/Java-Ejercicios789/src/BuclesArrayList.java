import java.util.ArrayList;

public class BuclesArrayList {

    /* Crea un ArrayList de tipo int y, utilizando un bucle, rellénalo con elementos 1..10.
       A continuación, con otro bucle, recórrelo y elimina los numeros pares.
       Por último, vuelve a recorrerlo y muestra el ArrayList final.
       Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
     */

    public static void main(String[] args) {

        //Creamos el ArrayList lista de tipo int
        ArrayList<Integer> lista = new ArrayList<>();

        //Rellenamos el ArrayList del 1 al 10 con un bucle for
        for (int i = 0; i < 10; i++) {
            lista.add(i + 1);
        }

        System.out.println("Array List con pares: " + lista);

        //Eliminamos los números pares del ArrayList con otro for
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i) % 2 == 0) {
                System.out.println("index: " + i + " valor: " + lista.get(i));
                lista.remove(i);
            } else {System.out.println(lista.get(i) + " no es par");}
        }
        // Se muestra el resultado final del ArrayList
        System.out.println("ArrayList sin numeros pares: " + lista);

    }




}
