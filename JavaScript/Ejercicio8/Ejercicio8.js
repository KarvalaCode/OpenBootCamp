// Crea un archivo JS que contenga las siguientes líneas

// - Una función sin parámetros que devuelva siempre "true"
function verdadero() {
    return true
}

console.log(verdadero());

// - Una función asíncrona que utilice un setTimeout y pase por consola un "Hola soy una promesa" 5 segundos después de haberse ejecutado
 function promesaAsinc() {
    console.log("Hola soy una promesa")
 }

    //setTimeout(function, milliseconds, param1, param2);
    setTimeout(promesaAsinc, 5000,);

// - Una función generadora de índices pares automáticos

function* generaIndices(){
    let indice = 0;
    while (true) {
        indice +=2;
        yield indice;
    }
}

const indice = generaIndices();

console.log(indice.next().value);
console.log(indice.next().value);
console.log(indice.next().value);
