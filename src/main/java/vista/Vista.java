package vista;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Curso;
import modelo.Alumno;
import modelo.Profesor;
import modelo.Materia;
import controlador.GestorCurso;
import controlador.GestorPagos;
import controlador.GestorProfesor;

public class Vista {
    private Scanner scanner;
    public GestorPagos gestorPagos;
    private GestorProfesor gestorProfesor;
    private GestorCurso gestorCurso; // Nuevo gestor para cursos
    private ArrayList<Alumno> alumnos;

    public Vista() {
        scanner = new Scanner(System.in);
        gestorPagos = new GestorPagos();
        gestorProfesor = new GestorProfesor();
        gestorCurso = new GestorCurso(); // Inicializar el gestor de cursos
        alumnos = new ArrayList<>();
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Agregar Profesor");
            System.out.println("2. Eliminar Profesor");
            System.out.println("3. Agregar Alumno");
            System.out.println("4. Eliminar Alumno");
            System.out.println("5. Calcular y Mostrar Pagos");
            System.out.println("6. Mostrar Alumnos");
            System.out.println("7. Mostrar Profesores");
            System.out.println("8. Mostrar Cursos");
            System.out.println("9. Agregar Curso");
            System.out.println("10. Agregar Alumno a Curso");
            System.out.println("11. Agregar Profesor a Curso");
            System.out.println("12. Asignar Materia a Profesor");
            System.out.println("13. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    agregarProfesor();
                    break;
                case 2:
                    eliminarProfesor();
                    break;
                case 3:
                    agregarAlumno();
                    break;
                case 4:
                    eliminarAlumno();
                    break;
                case 5:

                    mostrarPagos();
                    break;
                case 6:
                    mostrarAlumnos();
                    break;
                case 7:
                    mostrarProfesores();
                    break;
                case 8:
                    mostrarCursos();
                    break;
                case 9:
                    agregarCurso();
                    break;
                case 10:
                    agregarAlumnoACurso(); // Llamar al método para agregar alumno a curso
                    break;
                case 11:
                    agregarProfesorACurso(); // Llamar al método para agregar profesor a curso
                    break;
                case 12:
                    asignarMateriaAProfesor();
                    break;
                case 13:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private void mostrarCursos() {
        System.out.println("\n=== LISTA DE CURSOS ===");
        for (int i = 0; i < gestorCurso.getCursos().size(); i++) {
            System.out.println(i + ": " + gestorCurso.getCursos().get(i));
        }
    }
    private void mostrarPagos() {
        System.out.println("=== LISTA DE PROFESORES ===");
        ArrayList<String> resultados = gestorPagos.calcularPagos();
        if (resultados.isEmpty()) {
            System.out.println("No hay profesores registrados."); // Mensaje en Vista si no hay profesores
        } else {
            for (String resultado : resultados) {
                System.out.println(resultado); // Mostrar resultados en Vista
            }
        }
    }

    private void agregarProfesor() {
        System.out.print("Ingrese el nombre del profesor: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número de nómina: ");
        String numNomina = scanner.nextLine();
        Profesor profesor = new Profesor(nombre, numNomina, 250);
        gestorProfesor.agregarProfesor(profesor);
        System.out.println("Profesor agregado correctamente.");
    }
    private void eliminarProfesor() {
        System.out.print("Ingrese el número de nómina del profesor a eliminar: ");
        String numNomina = scanner.nextLine();
        if (gestorProfesor.eliminarProfesor(numNomina)) {
            System.out.println("Profesor eliminado correctamente.");
        } else {
            System.out.println("Profesor no encontrado.");
        }
    }
    private void agregarAlumno() {
        System.out.print("Ingrese la matrícula del alumno: ");
        String matricula = scanner.nextLine();
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del alumno: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        Alumno alumno = new Alumno(matricula, nombre, edad, null); // Inicialmente sin curso
        alumnos.add(alumno); // Agregar a la lista de alumnos
        System.out.println("Alumno agregado correctamente.");
    }
    private void eliminarAlumno() {
        System.out.print("Ingrese la matrícula del alumno a eliminar: ");
        String matricula = scanner.nextLine();
        boolean encontrado = false;
        for (Alumno alumno : alumnos) {
            if (alumno.getMatricula().equals(matricula)) {
                alumnos.remove(alumno);
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Alumno eliminado correctamente.");
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }
    private void mostrarAlumnos() {
        System.out.println("\n=== LISTA DE ALUMNOS ===");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    private void asignarMateriaAProfesor() {
        mostrarProfesores(); // Mostrar lista de profesores
        System.out.print("Seleccione el índice del profesor al que desea asignar una materia: ");
        int indiceProfesor = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        if (indiceProfesor < 0 || indiceProfesor >= gestorProfesor.getProfesores().size()) {
            System.out.println("Índice de profesor no válido.");
            return;
        }

        Profesor profesorSeleccionado = gestorProfesor.getProfesores().get(indiceProfesor);
        System.out.print("Ingrese el nombre de la materia: ");
        String nombreMateria = scanner.nextLine();
        System.out.print("Ingrese la clave de la materia: ");
        String claveMateria = scanner.nextLine();
        System.out.print("Ingrese los créditos de la materia: ");
        int creditos = scanner.nextInt();
        System.out.print("Ingrese las horas semanales de la materia: ");
        int horasSemanales = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        Materia materia = new Materia(nombreMateria, claveMateria, creditos, horasSemanales);
        profesorSeleccionado.asignarMateria(materia); // Asignar materia al profesor
        System.out.println("Materia asignada correctamente al profesor.");
    }

    private void mostrarProfesores() {
        System.out.println("\n=== LISTA DE PROFESORES ===");
        for (Profesor profesor : gestorProfesor.getProfesores()) {
            System.out.println(profesor);
        }
    }
    private void agregarCurso() {
        System.out.print("Ingrese el nombre del curso: ");
        String nombreCurso = scanner.nextLine();
        Materia[] materias = new Materia[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nMateria " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombreMateria = scanner.nextLine();
            System.out.print("Clave: ");
            String claveMateria = scanner.nextLine();
            System.out.print("Créditos: ");
            int creditos = scanner.nextInt();
            System.out.print("Horas semanales: ");
            int horasSemanales = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            materias[i] = new Materia(nombreMateria, claveMateria, creditos, horasSemanales);
        }

        Curso curso = new Curso(nombreCurso, materias);
        gestorCurso.agregarCurso(curso); // Agregar curso al gestor
        System.out.println("Curso agregado correctamente.");
    }

    private void agregarAlumnoACurso() {
        mostrarCursos(); // Mostrar cursos disponibles
        System.out.print("Seleccione el índice del curso al que desea agregar un alumno: ");
        int indiceCurso = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        if (indiceCurso < 0 || indiceCurso >= gestorCurso.getCursos().size()) {
            System.out.println("Índice de curso no válido.");
            return;
        }

        Curso cursoSeleccionado = gestorCurso.getCursos().get(indiceCurso);
        System.out.print("Ingrese la matrícula del alumno: ");
        String matricula = scanner.nextLine();
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del alumno: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        Alumno alumno = new Alumno(matricula, nombre, edad, cursoSeleccionado);
        if (cursoSeleccionado.agregarAlumno(alumno)) {
            System.out.println("Alumno agregado correctamente al curso.");
        } else {
            System.out.println("No se pueden agregar más de 23 alumnos a este curso.");
        }
    }

    private void agregarProfesorACurso() {
        mostrarCursos(); // Mostrar cursos disponibles
        System.out.print("Seleccione el índice del curso al que desea agregar un profesor: ");
        int indiceCurso = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        if (indiceCurso < 0 || indiceCurso >= gestorCurso.getCursos().size()) {
            System.out.println("Índice de curso no válido.");
            return;
        }

        Curso cursoSeleccionado = gestorCurso.getCursos().get(indiceCurso);
        System.out.print("Ingrese el nombre del profesor: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número de nómina: ");
        String numNomina = scanner.nextLine();
        Profesor profesor = new Profesor(nombre, numNomina, 250);
        cursoSeleccionado.agregarProfesor(profesor); // Agregar profesor al curso
        System.out.println("Profesor agregado correctamente al curso.");
    }

}