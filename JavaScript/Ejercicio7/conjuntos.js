// Crea un archivo llamado conjuntos.js que contenga las siguientes líneas

// - Un nuevo Set con los nombres de tu familia
const miFamilia = new Set(["Alex", "Kira", "Sara"]);

// - Modifica el Set original añadiendo tu nombre (duplicado) (debería darte lo mismo)
miFamilia.add("Sara");
console.log(miFamilia);

// - Modifica el Set original añadiendo el nombre "Javascript" (ya que empieza a formar parte de tu vida ;)
miFamilia.add("JavaScript");
console.log(miFamilia);
