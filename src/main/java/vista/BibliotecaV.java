package vista;

import controlador.BibliotecaC;
import modelo.Libro;
import modelo.Prestamo;
import modelo.Usuario;
import modelo.IdiomaMensajes; // Importar la interfaz
import modelo.IdiomaEspañol;
import modelo.IdiomaIngles;
import modelo.IdiomaChino;
import java.util.List;
import java.util.Scanner;

public class BibliotecaV {
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;

    private BibliotecaC controlador;
    private Scanner scanner;
    private IdiomaMensajes idiomaMensajes; // Cambiar a la interfaz

    public BibliotecaV(BibliotecaC controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
        seleccionarIdioma(); // Permitir al usuario seleccionar el idioma
    }

    private void seleccionarIdioma() {
        System.out.println("Seleccione el idioma:");
        System.out.println("1. Español");
        System.out.println("2. Inglés");
        System.out.println("3. Chino");
        int opcionIdioma = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcionIdioma) {
            case 1:
                idiomaMensajes = new IdiomaEspañol();
                break;
            case 2:
                idiomaMensajes = new IdiomaIngles();
                break;
            case 3:
                idiomaMensajes = new IdiomaChino();
                break;
            default:
                System.out.println("Opción no válida. Se seleccionará Español por defecto.");
                idiomaMensajes = new IdiomaEspañol();
        }
    }


    public void mostrarMenu() {
        while (true) {
            System.out.println(idiomaMensajes.getTitulo());
            System.out.println(idiomaMensajes.getOpcion1());
            System.out.println(idiomaMensajes.getOpcion2());
            System.out.println(idiomaMensajes.getOpcion3());
            System.out.println(idiomaMensajes.getOpcion4());
            System.out.println(idiomaMensajes.getOpcion5());
            System.out.print(idiomaMensajes.getSeleccion());

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
                    generarReporte();
                    break;
                case 5:
                    System.out.println(idiomaMensajes.getSalida());
                    return;
                default:
                    System.out.println(idiomaMensajes.getOpcionInvalida());
            }
        }
    }


    private void agregarLibro() {
            System.out.print(idiomaMensajes.getIdLibro());
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print(idiomaMensajes.gettituloLibro());
            String titulo = scanner.nextLine();
            System.out.print(idiomaMensajes.getautorLibro());
            String autor = scanner.nextLine();
            controlador.agregarLibro(id, titulo, autor);
            System.out.println(idiomaMensajes.getLibroAgregado());
        }

        private void agregarUsuario() {
            System.out.print(idiomaMensajes.getidUsuario());
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print(idiomaMensajes.getnombreUsuario());
            String nombre = scanner.nextLine();
            System.out.print(idiomaMensajes.getgmailUsuario());
            String email = scanner.nextLine();
            controlador.agregarUsuario(id, nombre, email);
            System.out.println(idiomaMensajes.getUsuarioAgregado());
        }

        private void realizarPrestamo() {
            System.out.print(idiomaMensajes.getlibroId());
            int idLibro = scanner.nextInt();
            System.out.print(idiomaMensajes.getusuarioId());
            int idUsuario = scanner.nextInt();
            if (controlador.realizarPrestamo(idLibro, idUsuario)) {
                System.out.println(idiomaMensajes.getPrestamoExitoso());
            } else {
                System.out.println(idiomaMensajes.getPrestamoFallido());
            }

        }
    private void generarReporte() {
        System.out.println(idiomaMensajes.getreporteBiblioteca());
        System.out.println(idiomaMensajes.gettotalLibros() + controlador.getTotalLibros());
        System.out.println(idiomaMensajes.gettotalUsuarios() + controlador.getTotalUsuarios());
        System.out.println(idiomaMensajes.gettotalPrestamos() + controlador.getTotalPrestamos());
    }
}
