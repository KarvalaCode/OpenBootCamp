// Crea un archivo JS que contenga las siguientes líneas

// - Una variable que contenga tu altura en centímetros (entero)
let alturaCM = 163;

// - Una variable que contenga tu altura en metros (número de coma flotante)
let alturaM = 1.63;

// - Una variable que contenga tu peso en kilogramos (número de coma flotante)
let pesoKG= 70.3;

// - Una variable que contenga tu altura en metros redondeada hacia arriba
let alturaRedondeoArriba = Math.ceil(alturaM);
console.log(alturaRedondeoArriba);

// - Una variable que contenga tu peso en kilogramos redondeado hacia abajo
let pesoRedondeoAbajo = Math.floor(pesoKG);
console.log(pesoRedondeoAbajo);

// - Una variable que contenga si "el máximo valor que se puede obtener en Javascript + 1" es igual al máximo valor que se puede obtener en Javascript
let maxJSmas1 = (Number.MAX_VALUE + 1) === (Number.MAX_VALUE);
console.log(maxJSmas1);