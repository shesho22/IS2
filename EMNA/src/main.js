window.addEventListener("DOMContentLoaded", () => {
  const loginForm = document.querySelector("#login-form");
  const welcomeMessage = document.querySelector("#welcome-message");

  loginForm.addEventListener("submit", (e) => {
      e.preventDefault(); // Evita el envío del formulario

      // Aquí puedes añadir lógica de autenticación si fuera necesario.
      // Por ahora, simplemente muestra el mensaje de bienvenida y redirige.

      loginForm.style.display = "none"; // Oculta el formulario
      welcomeMessage.style.display = "block"; // Muestra el mensaje de bienvenida

      // Redirige a la página del panel de usuario después de un breve retraso
      setTimeout(() => {
          window.location.href = "dashboard.html";
      }, 1000); // Espera 1 segundo antes de redirigir
  });
});
