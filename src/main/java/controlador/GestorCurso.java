package controlador;
import modelo.Curso;
import java.util.ArrayList;


import java.util.ArrayList;

public class GestorCurso {
    private ArrayList<Curso> cursos;

    public GestorCurso() {
        cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public Curso buscarCurso(String nombre) {
        for (Curso curso : cursos) {
            if (curso.getNombre().equalsIgnoreCase(nombre)) {
                return curso;
            }
        }
        return null; // Curso no encontrado
    }

    public ArrayList<Curso> getCursos() {
        return cursos; // Método para obtener la lista de cursos
    }
}