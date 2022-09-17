//- Vincula un evento de tipo "click" al botón, que muestre una alerta en el navegador "click en el botón"
    
const btn = document.getElementById("btn");

    btn.addEventListener("click", evento => {
        alert("Has hecho click en el botón");
    })

//- En el fichero index.js crea un evento click en el botón a través de jQuery, que muestre por consola "Hola, estoy utilizando jQuery"

$(() => {
    $("#btn").click(()=> {
        console.log("Hola, estoy utilizando jQuery");
    })
})
