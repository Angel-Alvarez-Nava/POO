package modelo;

import java.util.Arrays;
import java.util.ArrayList;

public class Curso {
    private static String nombre;
    private static ArrayList<Materia> materias;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Profesor> profesores; // Lista de profesores

    public Curso(String nombre, Materia[] materias) {
        this.nombre = nombre;
        this.materias = new ArrayList<>(Arrays.asList(materias));
        this.alumnos = new ArrayList<>();
        this.profesores = new ArrayList<>(); // Inicializar la lista de profesores
    }

    public boolean agregarAlumno(Alumno alumno) {
        if (alumnos.size() < 23) {
            alumnos.add(alumno);
            return true;
        }
        return false;
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor); // Agregar profesor al curso
    }

    public String toString() {
        return "Curso: " + nombre + " (" + getTotalCreditos() + " créditos)";
    }

    public static int getTotalCreditos() {
        int total = 0;
        for (Materia m : materias) total += m.getCreditos();
        return total;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos; // Método para obtener la lista de alumnos
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores; // Método para obtener la lista de profesores
    }
}