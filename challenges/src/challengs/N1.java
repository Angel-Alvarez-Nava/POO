package challengs;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del usuario
        System.out.print("Ingresa un nombre: ");
        String nombre = scanner.nextLine();

        // Mostrar el nombre normal
        System.out.println("Nombre normal: " + nombre);

        // Mostrar el nombre al revés
        String nombreReverso = new StringBuilder(nombre).reverse().toString();
        System.out.println("Nombre al revés: " + nombreReverso);

        scanner.close();
    }
}