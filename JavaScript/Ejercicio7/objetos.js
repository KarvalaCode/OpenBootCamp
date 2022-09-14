// Crea un archivo llamado objetos.js que contenga las siguientes líneas

// - Un objeto con tus datos personales (nombre, apellido, edad, altura, eresDesarrollador)
const datos = {
    nombre: "Sara",
    apellido: "Gómez",
    edad: 39,
    altura: 163,
    esDesarrollador: false
}

// - Una variable que obtenga tu edad a partir del objeto anterior
const edad = datos.edad;
console.log(edad);

// - Una lista que contenga el objeto con tus datos personales y un nuevo objeto con los datos personales de tus dos mejores amig@s
const amigo1 = {
    nombre: "Alex",
    apellido: "Fernández",
    edad: 38,
    altura: 163,
    esDesarrollador: true
}

const amiga2 = {
    nombre: "Eva",
    apellido: "López",
    edad: 42,
    altura: 175,
    esDesarrollador: false
}

const datos_y_amigos = [datos, amigo1, amiga2]
console.log(datos_y_amigos);

// - Una nueva lista con los objetos de la lista anterior ordenados por edad, de mayor a menor
const datos_y_amigos_por_edad = datos_y_amigos.sort ((a,b) => b.edad-a.edad);
console.log(datos_y_amigos_por_edad);