// Crea un nuevo proyecto de Node

// - Instala la dependencia ESLint (https://www.npmjs.com/package/eslint)

// - Duplica el archivo del ejercicio de la sesión 04-Textos
    
    let nombre = "Sara";

    let apellido = "Gómez";


    let estudiante = nombre.concat(" ", apellido);
    console.log (estudiante);

    let estudianteMayus = estudiante.toUpperCase();
    console.log(estudianteMayus);

    let estudianteMinus = estudiante.toLowerCase();
    console.log(estudianteMinus);

    let letrasEstudiante = estudiante.length;
    console.log(letrasEstudiante);

    let primeraLetra = estudiante.charAt(0);
    console.log(primeraLetra);

    let ultimaLetra = estudiante.charAt(9);
    console.log(ultimaLetra);

    let sinEspaciosDelanteDetras = estudiante.trim();
    console.log(sinEspaciosDelanteDetras);

    let sinNingunEspacio = estudiante.replace(/ /g, "");
    console.log(sinNingunEspacio);

    let estaEn = estudiante.includes(nombre);
    console.log(estaEn);
    
// - Utiliza los tres estilos de comillas de forma alterna (comillas simples, dobles, backticks)

// - Crea el fichero .eslintrc.json

// - Cambia la configuración de ESLint para que la versión ecmaVersion sea "latest"

// - Cambia la configuración de ESLint para que muestre un error cada vez que las comillas no sean dobles

// - Crea un script en el package.json para corregir automáticamente todos los errores

// - Ejecuta el script a través del terminal