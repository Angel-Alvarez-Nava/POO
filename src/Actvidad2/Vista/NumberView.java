package Actvidad2.Vista;

public class NumberView {

    // Método para mostrar un mensaje genérico
    public void showMessage(String message) {
        System.out.println(message);
    }

    // Método para mostrar los números almacenados en un arreglo
    public void displayEvenNumbers(int[] numbers) {
        System.out.println("Números pares del 2 al 100:");
        for (int number : numbers) {
            System.out.print(number + " "); // Imprime los números en una misma línea
        }
        System.out.println(); // Salto de línea al finalizar
    }

}
