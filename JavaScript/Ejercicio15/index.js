// - En el fichero index.js:

// - Crea una variable con tu nombre
const nombre = "Sara";

// - Crea una variable con tu apellido
const apellido = "Gómez";

// - Crea un objeto con tu nombre y tu apellido
const usuario = {
    nombre,
    apellido
} 

// - Almacena el objeto anterior en la SessionStorage
const usuarioStr = JSON.stringify(usuario);

sessionStorage.setItem("usuario", usuarioStr);

// - Almacena el objeto anterior en la LocalStorage
localStorage.setItem("usuario", usuarioStr);

// - Crea una cookie que caduque en 2 minutos con los datos del objeto anterior
const fecha = new Date();
const fecha2 = new Date(fecha.getTime() + 120000);
document.cookie = `usuario=${usuarioStr}; expires=${fecha2}`;

// - Observa en Google Chrome cómo se almacenan los datos en la SessionStorage, LocalStorage y las cookies

// - Cierra el navegador, comenta las líneas que almacenan SessionStorage, LocalStorage y CookieStorage y vuelve a abrirlo

// - Observa cómo la SessionStorage está vacía

// - Observa cómo la LocalStorage sigue manteniendo el objeto que has almacenado antes de cerrar el navegador

// - Observa cómo la cookie sigue manteniendo el objeto que has almacenado antes, aunque ya está caducado