package Actvidad2.Controlador;

import Actvidad2.Modelo.EvenNumbersGenerator;
import Actvidad2.Vista.NumberView;

public class NumberController {

    private final EvenNumbersGenerator evenNumbersGenerator; // Modelo
    private final NumberView consoleView; // Vista

    public NumberController() {
        evenNumbersGenerator = new EvenNumbersGenerator(); // Inicializa el modelo
        consoleView = new NumberView();                   // Inicializa la vista
    }

    // Método para ejecutar el flujo del programa
    public void run() {
        // Solicita al modelo generar los números pares
        int[] evenNumbers = evenNumbersGenerator.generateEvenNumbers();

        // Muestra los números pares mediante la vista
        consoleView.showMessage("Generando una lista de números pares...");
        consoleView.displayEvenNumbers(evenNumbers);
    }
}