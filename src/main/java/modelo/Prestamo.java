package modelo;
import java.time.LocalDate;
public class Prestamo {

        private int id;
        private Libro libro;
        private Usuario usuario;
        private LocalDate fechaPrestamo;
        private LocalDate fechaDevolucion;

        public Prestamo(int id, Libro libro, Usuario usuario, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
            this.id = id;
            this.libro = libro;
            this.usuario = usuario;
            this.fechaPrestamo = fechaPrestamo;
            this.fechaDevolucion = fechaDevolucion;
        }

        public int getId() {
            return id;
        }

        public Libro getLibro() {
            return libro;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public LocalDate getFechaPrestamo() {
            return fechaPrestamo;
        }

        public LocalDate getFechaDevolucion() {
            return fechaDevolucion;
        }
    }

