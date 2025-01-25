package challengs;

import java.util.Scanner;

public class chico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la secuencia de números
        System.out.println("Ingresa una secuencia de números separados por espacios:");
        String input = scanner.nextLine();

        // Dividir la secuencia en un arreglo de Strings
        String[] numerosStr = input.split(" ");

        // Encontrar el valor más pequeño
        int min = Integer.MAX_VALUE; // Inicialmente el valor más alto posible
        for (String numero : numerosStr) {
            int valor = Integer.parseInt(numero); // Convertir cada cadena en entero
            if (valor < min) {
                min = valor; // Actualizar el valor mínimo si es más bajo que el actual
            }
        }

        // Mostrar el valor más pequeño
        System.out.println("El valor más pequeño en la secuencia es: " + min);

        scanner.close();
    }
}
