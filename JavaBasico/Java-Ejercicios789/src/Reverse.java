public class Reverse {
    /* Escribe el código que devuelva una cadena al revés.
    Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    */
    public static String reverse(String texto) {

        //Variables a modificar en el for
        String textoReverso ="";
        String letra;

        //Recorrer la cadena de atràs para delante
        for (int i = texto.length() - 1; i >= 0; i--) {
            letra = Character.toString(texto.charAt(i));
            textoReverso = textoReverso.concat(letra);
        }

        //devuelve la cadena del revés
        return textoReverso;
    }

    //Se imprime el texto al revés
    public static void main(String[] args) {
        System.out.println(reverse("Mensaje de Texto"));
    }
}
