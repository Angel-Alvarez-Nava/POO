package modelo;

public class IdiomaEspañol implements IdiomaMensajes {
    public String getTitulo() { return "=== Sistema de Gestión de Biblioteca ==="; }
    public String getOpcion1() { return "1. Agregar Libro"; }
    public String getOpcion2() { return "2. Agregar Usuario"; }
    public String getOpcion3() { return "3. Realizar Préstamo"; }
    public String getOpcion4() { return "4. Generar Reporte"; }
    public String getOpcion5() { return "5. Salir"; }
    public String getSeleccion() { return "Seleccione una opción: "; }
    public String getSalida() { return "Saliendo..."; }
    public String getidUsuario() { return "ingresa id usuario";}
    public String getnombreUsuario() { return "Nombre del usuario";}
    public String getgmailUsuario() { return " gmail del usuario";}
    public String getIdLibro(){ return "Id del libro";}
    public String getautorLibro() { return " Autor del libro" ;}
    public String gettituloLibro() { return "Titulo del libro";}
    public String getlibroId() { return  "Id de el libro";}
    public String getusuarioId() { return " Id de usuario";}
    public String gettotalLibros() { return "Total de libros";}
    public String gettotalPrestamos() { return "Total de prestamos";}
    public String gettotalUsuarios(){ return "Usuarios totales";}
    public String getreporteBiblioteca() { return  " Reporte de biblioteca";}
    public String getOpcionInvalida() { return "Opción no válida. Intente de nuevo."; }
    public String getLibroAgregado() { return "Libro agregado exitosamente."; }
    public String getUsuarioAgregado() { return "Usuario agregado exitosamente."; }
    public String getPrestamoExitoso() { return "Préstamo realizado exitosamente."; }
    public String getPrestamoFallido() { return "No se pudo realizar el préstamo. Verifique la disponibilidad del libro y el número de préstamos activos del usuario."; }
}