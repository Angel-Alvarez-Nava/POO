package Actvidad2.Controlador;
import Actvidad2.Modelo.NameGenerator;
import Actvidad2.Vista.UserInput;
public class controllerName {

        private final NameGenerator nameGenerator;
        private final UserInput userInput;

        public controllerName() {
            nameGenerator = new NameGenerator(); // Inicializa el modelo
            userInput = new UserInput();     // Inicializa la vista
        }

        // Ejecuta el flujo completo de la aplicación
        public void run() {
            // Llama a la vista para solicitar el nombre al usuario
            String userName = userInput.askName();

            // Llama al modelo para verificar el nombre ingresado
            String response = nameGenerator.checkName(userName);

            // Muestra el mensaje retornado por el modelo
            userInput.showMessage(response);
        }
    }

