const cuadrados = document.querySelectorAll(".cuadrado");
const secciones = document.querySelectorAll(".seccion");
const papelera = document.getElementById("papelera");

cuadrados.forEach(cuadrado => {
    cuadrado.addEventListener("dragstart", evento => {
        evento.dataTransfer.setData("id", cuadrado.id);
    })
    cuadrado.addEventListener("dragover", evento =>{
        evento.preventDefault();
    })
})

secciones.forEach(seccion => {
    seccion.addEventListener("dragover", evento =>{
        evento.preventDefault();
        evento.dataTransfer.dropEffect = "copy";
    })

    seccion.addEventListener("drop", evento => {
        const idCuadrado = evento.dataTransfer.getData("id");
        const cuadrado = document.getElementById(idCuadrado);
        seccion.appendChild(cuadrado); 
    })
})

papelera.addEventListener("dragover", evento =>{
        evento.preventDefault();
        evento.dataTransfer.dropEffect = "copy";
})        

papelera.addEventListener("drop", evento =>{
    const idPapelera = evento.dataTransfer.getData("id");
    const cubo = document.getElementById(idPapelera);
    cubo.parentNode.removeChild(cubo); 

})


