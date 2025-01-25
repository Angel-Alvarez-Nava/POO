package Actvidad2.Modelo;

public class NameGenerator {
        private final String expectedName = "Belinda"; // Nombre específico a verificar (puedes cambiarlo)

        // Método para verificar el nombre ingresado
        public String checkName(String inputName) {
            if (inputName.equalsIgnoreCase(expectedName)) {
                return "¡Hola, " + expectedName + "! Es un gusto verte.";
            } else {
                return "Hola, " + inputName + ". No te reconocemos, pero bienvenido.";
            }
        }
    }



