package modelo;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Biblioteca {

    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean realizarPrestamo(int idLibro, int idUsuario) {
        Libro libro = libros.stream().filter(l -> l.getId() == idLibro && l.isDisponible()).findFirst().orElse(null);
        Usuario usuario = usuarios.stream().filter(u -> u.getId() == idUsuario).findFirst().orElse(null);

        if (libro != null && usuario != null && usuario.realizarPrestamo()) {
            libro.setDisponible(false);
            Prestamo nuevoPrestamo = new Prestamo(prestamos.size() + 1, libro, usuario, LocalDate.now(), LocalDate.now().plusDays(15));
            prestamos.add(nuevoPrestamo);
            return true;
        }
        return false;
    }

    public void generarReporte() {
        System.out.println("Reporte de Biblioteca:");
        System.out.println("Total de libros: " + libros.size());
        System.out.println("Total de usuarios: " + usuarios.size());
        System.out.println("Total de préstamos: " + prestamos.size());

    }
}