// Crea un archivo JS que contenga las siguientes líneas

// - Una cadena de texto con tu Nombre
let nombre = "Sara";

// - Otra cadena de texto con tu Apellido
let apellido = "Gómez"

// - Una cadena de texto que se llame "estudiante" concatenando tu Nombre y tu Apellido con un espacio entre medias
let estudiante = nombre.concat(" ", apellido);
console.log (estudiante);

// - Una cadena de texto que se llame "estudianteMayus" que contenga la cadena estudiante pero todo en mayúsculas
let estudianteMayus = estudiante.toUpperCase();
console.log(estudianteMayus);

// - Una cadena de texto que se llame "estudianteMinus" que contenga la cadena estudiante pero todo en minúsculas
let estudianteMinus = estudiante.toLowerCase();
console.log(estudianteMinus);

// - Una variable que contenga el número de letras de la cadena "estudiante" contando los espacios
let letrasEstudiante = estudiante.length;
console.log(letrasEstudiante);

// - Una variable que contenga la primera letra del Nombre
let primeraLetra = estudiante.charAt(0);
console.log(primeraLetra);

// - Otra variable que contenga la última letra del Apellido
let ultimaLetra = estudiante.charAt(9);
console.log(ultimaLetra);

// - Una cadena de texto que elimine los espacios de la variable "estudiante"

    //Eliminar espacios al principio y al final de la cadena de texto
    let sinEspaciosDelanteDetras = estudiante.trim();
    console.log(sinEspaciosDelanteDetras);

    //Elimina todos los espacios de la cadena de texto
    let sinNingunEspacio = estudiante.replace(/ /g, "");
    console.log(sinNingunEspacio);

// - Una variable booleana que diga si el Nombre está contenido en la variable "estudiante"
let estaEn = estudiante.includes(nombre);
console.log(estaEn);