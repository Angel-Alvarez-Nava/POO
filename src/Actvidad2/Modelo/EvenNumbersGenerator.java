package Actvidad2.Modelo;

public class EvenNumbersGenerator {

    // Método para generar un arreglo con números pares desde 2 hasta 100
    public int[] generateEvenNumbers() {
        int size = 50; // Sabemos que hay 50 números pares del 2 al 100
        int[] evenNumbers = new int[size];
        int number = 2;

        for (int i = 0; i < size; i++) {
            evenNumbers[i] = number;
            number += 2; // Incrementa en pasos de 2
        }

        return evenNumbers; // Retorna el arreglo generado
    }
}
