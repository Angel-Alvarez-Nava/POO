package modelo;

public class Alumno {
    private String matricula;
    private String nombre;
    private int edad;
    private Curso curso;

    public Alumno(String matricula, String nombre, int edad, Curso curso) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String toString() {
        return nombre + " (" + matricula + "), Edad: " + edad + "\n" + curso;
    }
}