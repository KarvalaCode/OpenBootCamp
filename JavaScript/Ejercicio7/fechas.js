// Crea un archivo llamado fechas.js que contenga las siguientes líneas

// - La fecha de hoy
const fechaActual = new Date();
console.log(fechaActual);

// - La fecha de tu nacimiento
const fechaNacimiento = new Date(1982, 09, 03, 01, 30);
console.log(fechaNacimiento);

// - Un variable que indique si hoy es más tarde (>) que la fecha de tu nacimiento
const heNacido = fechaActual > fechaNacimiento;
console.log(heNacido);

// - Una variable que contenga el día de tu nacimiento
const diaNacimiento = fechaNacimiento.getDate();
console.log(diaNacimiento);

// - Una variable que contenga el mes de tu nacimiento (recuerda que Enero es mes 0)
const mesNacimiento = fechaNacimiento.getMonth() +1;
console.log(mesNacimiento);

// - Una variable que contenga el año de tu nacimiento (con 4 dígitos)
const anyNacimiento = fechaNacimiento.getFullYear();
console.log(anyNacimiento);