public class ArrayStrings {

    /* - Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
       - Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
     */

    public static void main(String[] args) {

        //Array unidimensional
        int[] arrayUni = {1, 2, 3, 4, 5};

        //Lo recorremos y mostramos los valores del array
        for (int num : arrayUni) {
            System.out.println("El valor del Array unidimensional es: " + num);
        }

        //Array bidimensional
        int[][] arrayBi = new int[3][3];
        arrayBi[0][0] = 1;
        arrayBi[0][1] = 2;
        arrayBi[0][2] = 3;
        arrayBi[1][0] = 10;
        arrayBi[1][1] = 20;
        arrayBi[1][2] = 30;
        arrayBi[2][0] = 100;
        arrayBi[2][1] = 200;
        arrayBi[2][2] = 300;

        //Recorremos el array bidimensional mostrando valor y posición en las dos dimensiones mediante for's anidados
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[1].length; j++) {
                System.out.println("Posicion fila: " + i + " posicion columna: " + j + " valor: " + arrayBi[i][j]);
            }
        }

        }

    }

