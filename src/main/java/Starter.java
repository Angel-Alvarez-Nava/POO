import controlador.BibliotecaC;
import vista.BibliotecaV;

public class Starter {

        public static void main(String[] args) {
            BibliotecaC controlador = new BibliotecaC();
            BibliotecaV vista = new BibliotecaV(controlador);
            vista.mostrarMenu();
        }
    }
