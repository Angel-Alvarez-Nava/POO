package modelo;

import java.util.ArrayList;

public class Profesor {
    private static String nombre;
    private String numNomina;
    private double sueldoPorHora;
    private ArrayList<Materia> materias;
    private String status; // "vigente" o "no vigente"

    public Profesor(String nombre, String numNomina, double sueldoPorHora) {
        this.nombre = nombre;
        this.numNomina = numNomina;
        this.sueldoPorHora = sueldoPorHora;
        this.materias = new ArrayList<>();
        this.status = "vigente"; // Por defecto, el profesor es vigente
    }

    public void asignarMateria(Materia materia) {
        this.materias.add(materia);
    }

    public double calcularSueldoSemanal() {
        double totalSueldo = 0;
        for (Materia materia : materias) {
            totalSueldo += materia.getHorasSemanales() * sueldoPorHora;
        }
        // Incremento del 25% por cada materia extra
        if (materias.size() > 1) {
            totalSueldo *= 1 + 0.25 * (materias.size() - 1);
        }
        return totalSueldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static String getNombre() {
        return nombre;
    }

    public String getNumNomina() {
        return numNomina;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public String toString() {
        return nombre + " (Nómina: " + numNomina + ", Status: " + status + ")";
    }

}