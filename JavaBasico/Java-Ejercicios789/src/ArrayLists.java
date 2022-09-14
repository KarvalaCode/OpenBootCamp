import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLists {

    /* Crea un ArrayList de tipo String, con 4 elementos.
       Cópialo en una LinkedList.
       Recorre ambos mostrando únicamente el valor de cada elemento.
     */

    public static void main(String[] args) {

        //Creamos el ArrayList de Strings con 4 elementos
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");
        lista.add("ElementoD");

        //Creamos la LinkedList dónde copiamos el ArrayList
        LinkedList<String> listaLink = new LinkedList<>(lista);

        //Recorremos el ArrayList mostrando el valor de sus elementos
        for (String elemento : lista){
            System.out.println("Valor ArrayList: " + elemento);
        }

        //Recorremos la LinkesList mostrando el valor de sus elementos
        for (String valor : listaLink) {
            System.out.println("Valor LinkedList: " + valor);
        }
    }




}
