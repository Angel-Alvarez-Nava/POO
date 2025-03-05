import operaciones.Operacion;
import operaciones.Resta;
import operaciones.Raiz;
import operaciones.Multiplicacion;
import operaciones.Division;
import operaciones.Potencia;
import operaciones.Suma;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.Map;



public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Operacion> operaciones = new HashMap<>();
        operaciones.put(1, new Suma());
        operaciones.put(2, new Resta());
        operaciones.put(3, new Multiplicacion());
        operaciones.put(4, new Division());
        operaciones.put(5, new Potencia());
        operaciones.put(6, new Raiz());

        while (true) {
            System.out.println("Seleccione la operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Salir");

            int seleccion;
            try {
                seleccion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intente de nuevo.");
                scanner.next();
                continue;
            }

            if (seleccion == 7) {
                System.out.println("Saliendo de la calculadora.");
                break;
            }

            Operacion operacion = operaciones.get(seleccion);
            if (operacion == null) {
                System.out.println("Opción no válida.");
                continue;
            }

            double num1, num2 = 0;
            System.out.print("Ingrese el primer número: ");
            num1 = scanner.nextDouble();

            if (!(operacion instanceof Raiz)) {
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
            }

            try {
                double resultado = operacion.calcular(num1, num2);
                System.out.println("Resultado: " + resultado);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
