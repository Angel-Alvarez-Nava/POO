package controlador;
import modelo.Profesor;
import java.util.ArrayList;

public class GestorPagos {
    private ArrayList<Profesor> profesores = new ArrayList<>();

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public ArrayList<String> calcularPagos() {
        ArrayList<String> resultados = new ArrayList<>();
        for (Profesor profesor : profesores) {
            double sueldoSemanal = profesor.calcularSueldoSemanal();
            resultados.add(profesor.toString() + " - Sueldo semanal: $" + sueldoSemanal);
        }
        return resultados;
    }
}