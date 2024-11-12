// Función para cargar los datos de la API según la opción seleccionada
function loadData(route) {
    // URL base de la API
    const apiUrl = `http://127.0.0.1:8000/${route}/`;

    // Limpiar la sección de datos antes de cargar nuevos datos
    document.getElementById("api-data").innerHTML = "<p>Cargando datos...</p>";

    // Realizar la solicitud a la API
    fetch(apiUrl)
        .then(response => {
            // Verificar si la respuesta es exitosa (status 200)
            if (!response.ok) {
                throw new Error(`Error: ${response.statusText}`);
            }
            return response.json(); // Convertir la respuesta a JSON
        })
        .then(data => {
            // Comprobar si los datos tienen la estructura esperada
            if (Array.isArray(data) && data.length > 0) {
                // Si los datos son una lista, mostrarlos
                displayData(data);
            } else {
                // Si no son una lista, mostrar un mensaje de error
                document.getElementById("api-data").innerHTML = "<p>No se encontraron datos disponibles.</p>";
            }
        })
        .catch(error => {
            // Manejar errores de red o de conversión de JSON
            console.error("Error al cargar los datos:", error);
            document.getElementById("api-data").innerHTML = `<p>Error al cargar los datos: ${error.message}</p>`;
        });
}

// Función para mostrar los datos en el centro de la página
function displayData(data) {
    let htmlContent = "<ul class='list-group'>";

    // Iterar sobre los datos y crear una lista
    data.forEach(item => {
        htmlContent += `<li class='list-group-item'>${JSON.stringify(item)}</li>`;
    });

    htmlContent += "</ul>";
    document.getElementById("api-data").innerHTML = htmlContent;
}

// Cargar los datos al iniciar la página (por defecto 'admin')
window.onload = function() {
    loadData('admin');
};
