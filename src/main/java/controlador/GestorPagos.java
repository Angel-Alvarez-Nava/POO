package controlador;
import modelo.Profesor;
import java.util.ArrayList;

public class GestorPagos {
    private ArrayList<Profesor> profesores = new ArrayList<>();

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void calcularYMostrarPagos() {
        System.out.println("\n=== PAGOS A PROFESORES ===");
        for (Profesor profesor : profesores) {
            double sueldoSemanal = profesor.calcularSueldoSemanal();
            System.out.println(Profesor.getNombre() + " - Sueldo semanal: $" + sueldoSemanal);
        }
    }
}
