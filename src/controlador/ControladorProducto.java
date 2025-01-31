package controlador;
import modelo.Producto;

import java.util.Scanner;
public class ControladorProducto {

        private Scanner scanner = new Scanner(System.in);

        public Producto crearProducto() {
            Producto producto = new Producto();
            try {
                System.out.print("Ingrese el código del producto: ");
                producto.setCodigo(scanner.nextLine());

                System.out.print("Ingrese el tipo del producto: ");
                producto.setTipo(scanner.nextLine());

                System.out.print("Ingrese el costo del producto: ");
                producto.setCosto(scanner.nextLine());

                System.out.print("Ingrese el impuesto del producto: ");
                producto.setImpuesto(scanner.nextDouble());
                scanner.nextLine(); // Limpiar el buffer

            } catch (Exception e) {
                System.out.println("Error en la entrada de datos: " + e.getMessage());
            }
            return producto;
        }

        public String compararProductos(Producto p1, Producto p2, double utilidad) {
            double precio1 = p1.calcularPrecio(utilidad);
            double precio2 = p2.calcularPrecio(utilidad);

            if (precio1 > precio2) {
                return "El producto con mayor precio de venta es: " + p1.getTipo();
            } else {
                return "El producto con mayor precio de venta es: " + p2.getTipo();
            }
        }
    }

