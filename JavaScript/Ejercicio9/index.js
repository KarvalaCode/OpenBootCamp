// Crea un nuevo proyecto de Node

// - Instala la dependencia Winston
const logger = require('./logger');

// - En el archivo index.js crea una función que devuelva un error con un mensaje personalizado
function mensajeError() {
    throw new Error ('Esto es un error, deberíamos hablarlo')
}

// - Registra el error en un archivo a través de un try...catch
try {
    mensajeError();

}
catch (e) {
    logger.error(`ERROR! ${e}`);
}

