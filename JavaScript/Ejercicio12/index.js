// Crea un nuevo fichero JS que contenga las siguientes líneas

// - Una función que admita un parámetro "num", y devuelva una lista con esa cantidad de números de la secuencia de Fibonacci (Por ejemplo: num = 6 => Resultado [1, 1, 2, 3, 5, 8])

function getListaFib(num){
    const FIB = [1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597];
    let listaFib = [];

    for (i=0; i< num; i++) {
        listaFib = [...listaFib, FIB[i]];
    }

    return listaFib;
}

console.log(getListaFib(6))
console.log(getListaFib(8))

// - Ejecuta la depuración de VSCode para visualizar la ejecución de la función