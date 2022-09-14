/* Crea el archivo factorial-break.js -> 
Este archivo debe calcular el factorial de 10 utilizando
- un bucle while
- una bifurcación if
- y una sentencia break */

var i=1;
var factorial = 1;

//Bucle while + if + break para calcular el factorial de 10 
while (i<100) {
    factorial = factorial*i;
    i++;

    if (i===11){
        break;
    }

    console.log (factorial);    
    console.log (i)
}