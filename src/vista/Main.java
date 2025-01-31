package vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Producto;
import controlador.ControladorProducto;




public class Main {
    /**
     * Genera un menu donde podemos agregar,mostrar,comprar productos y tambien podremos salir de el
     * @param mostrarMenu el menu ejecutable
     * @param insertarProductos agregar nuevos productos
     * @param mostrarProductos muestra todos los productos que tenggamos
     * @param comprarProductos puedes comprar el producto que desees
     */
    private ControladorProducto controlador;
    private List<Producto> productos;
    private Scanner scanner;

    public Main() {
        controlador = new ControladorProducto();
        productos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ingresar productos");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Comparar productos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    ingresarProductos();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    compararProductos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    private void ingresarProductos() {
        System.out.print("¿Cuántos productos desea ingresar? ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("\nIngrese los datos del producto " + (i + 1) + ":");
            Producto producto = controlador.crearProducto();
            productos.add(producto);
        }
    }

    private void mostrarProductos() {
        System.out.println("\nDetalles de los productos ingresados:");
        double utilidad = 20.0; // Porcentaje de utilidad
        for (Producto producto : productos) {
            producto.muestraPrecio(utilidad);
        }
    }

    private void compararProductos() {
        if (productos.size() >= 2) {
            double utilidad = 20.0; // Porcentaje de utilidad
            String resultado = controlador.compararProductos(productos.get(0), productos.get(1), utilidad);
            System.out.println("\n" + resultado);
        } else {
            System.out.println("Se necesitan al menos dos productos para comparar.");
        }
    }
}