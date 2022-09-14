// Crea un archivo JS que contenga las siguientes líneas

// - Una variable que contenga la lista de la compra (mínimo 5 elementos)
let listaCompra = ["Leche", "Fruta", "Garbanzos", "Croquetas", "Papel de váter", "Tomates"];

// - Modifica la lista de la compra y añádele "Aceite de Girasol"
listaCompra.push("Aceite de Girasol");
console.log(listaCompra);
// - Vuelve a modificar la lista de la compra eliminando "Aceite de Girasol"
listaCompra.pop()
console.log(listaCompra);

// - Una lista de tus 3 películas favoritas (objetos con propiedades: titulo, director, fecha)
const pelisFav = [
    {titulo: "The Shawshank Redemption", director: "Frank Darabont", fecha: 1994, edad: 13},
    {titulo: "Seven", director: "David Fincher", fecha: 1995, edad: 18},
    {titulo: "Forrest Gump", director: "Robert Zemeckis", fecha: 1994, edad: 13}]

// - Una nueva lista que contenga las películas posteriores al 1 de enero de 2010 (utilizando filter)
    //No hay ninguna película posterior al 2010, así que se filtran las posteriores al 1994

const pelisNuevas = pelisFav.filter(peli => peli.fecha > 1994);
console.log(pelisNuevas);

// - Una nueva lista que contenga los directores de la lista de películas original (utilizando map)
const directores = pelisFav.map(peli => peli.director);
console.log(directores);

// - Una nueva lista que contenga los títulos de la lista de películas original (utilizando map)
const titulos = pelisFav.map(peli => peli.titulo);
console.log(titulos);

// - Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando concat)
const directores_y_titulos = directores.concat(titulos);
console.log(directores_y_titulos);

// - Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando el factor de propagación)
const directores_y_titulosProp = [...directores, ...titulos];
console.log(directores_y_titulosProp);
