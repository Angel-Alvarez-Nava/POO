package vista;
import controlador.BibliotecaC;

import java.util.Scanner;

public class BibliotecaV {

        private BibliotecaC controlador;
        private Scanner scanner;

        public BibliotecaV(BibliotecaC controlador) {
            this.controlador = controlador;
            this.scanner = new Scanner(System.in);
        }

        public void mostrarMenu() {
            while (true) {
                System.out.println("=== Sistema de Gestión de Biblioteca ===");
                System.out.println("1. Agregar Libro");
                System.out.println("2. Agregar Usuario");
                System.out.println("3. Realizar Préstamo");
                System.out.println("4. Generar Reporte");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        agregarLibro();
                        break;
                    case 2:
                        agregarUsuario();
                        break;
                    case 3:
                        realizarPrestamo();
                        break;
                    case 4:
                        controlador.generarReporte();
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        return;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }

        private void agregarLibro() {
            System.out.print("Ingrese ID del libro: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese título del libro: ");
            String titulo = scanner.nextLine();
            System.out.print("Ingrese autor del libro: ");
            String autor = scanner.nextLine();
            controlador.agregarLibro(id, titulo, autor);
            System.out.println("Libro agregado exitosamente.");
        }

        private void agregarUsuario() {
            System.out.print("Ingrese ID del usuario: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese nombre del usuario: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese email del usuario: ");
            String email = scanner.nextLine();
            controlador.agregarUsuario(id, nombre, email);
            System.out.println("Usuario agregado exitosamente.");
        }

        private void realizarPrestamo() {
            System.out.print("Ingrese ID del libro a prestar: ");
            int idLibro = scanner.nextInt();
            System.out.print("Ingrese ID del usuario: ");
            int idUsuario = scanner.nextInt();
            if (controlador.realizarPrestamo(idLibro, idUsuario)) {
                System.out.println("Préstamo realizado exitosamente.");
            } else {
                System.out.println("No se pudo realizar el préstamo. Verifique la disponibilidad del libro y el número de préstamos activos del usuario.");
            }
        }
    }

