package controlador;

import modelo.Profesor;
import java.util.ArrayList;

public class GestorProfesor {
    private ArrayList<Profesor> profesores;

    public GestorProfesor() {
        profesores = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public boolean eliminarProfesor(String numNomina) {
        for (Profesor profesor : profesores) {
            if (profesor.getNumNomina().equals(numNomina)) {
                profesores.remove(profesor);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
}