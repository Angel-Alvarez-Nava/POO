package Actvidad2.Vista;
import java.util.Scanner;
public class UserInput {


        // Método para solicitar el nombre al usuario
        public String askName() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor, ingresa tu nombre:");
            return scanner.nextLine();
        }

        // Método para mostrar un mensaje de salida
        public void showMessage(String message) {
            System.out.println(message);
        }
    }


