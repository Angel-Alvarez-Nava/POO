package modelo;

public class Usuario {
        private int id;
        private String nombre;
        private String email;
        private int prestamosActivos;

        public Usuario(int id, String nombre, String email) {
            this.id = id;
            this.nombre = nombre;
            this.email = email;
            this.prestamosActivos = 0;
        }

        public int getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        public String getEmail() {
            return email;
        }

        public int getPrestamosActivos() {
            return prestamosActivos;
        }

        public boolean realizarPrestamo() {
            if (prestamosActivos < 2) {
                prestamosActivos++;
                return true;
            }
            return false;
        }
    }

