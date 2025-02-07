package modelo;

public class IdiomaIngles implements IdiomaMensajes {
    public String getTitulo() { return "=== Library Management System ==="; }
    public String getOpcion1() { return "1. Add Book"; }
    public String getOpcion2() { return "2. Add User"; }
    public String getOpcion3() { return "3. Make Loan"; }
    public String getOpcion4() { return "4. Generate Report"; }
    public String getOpcion5() { return "5. Exit"; }
    public String getSeleccion() { return "Select an option: "; }
    public String getSalida() { return "Exiting..."; }
    public String getidUsuario() { return "ID user";}
    public String getnombreUsuario() { return "user name";}
    public String getgmailUsuario() { return " gmail user";}
    public String getIdLibro(){ return "Id book";}
    public String getautorLibro() { return " author of book" ;}
    public String gettituloLibro() { return " title of book";}
    public String getlibroId() { return  "Book id";}
    public String getusuarioId() { return " User id";}
    public String getOpcionInvalida() { return "Invalid option. Please try again."; }
    public String getLibroAgregado() { return "Book added successfully."; }
    public String getUsuarioAgregado() { return "User  added successfully."; }
    public String getPrestamoExitoso() { return "Loan successfully made."; }
    public String gettotalPrestamos() { return "Loan total: ";}
    public String gettotalLibros() { return "Book total: ";}
    public String gettotalUsuarios(){ return "Users total: ";}
    public String getreporteBiblioteca() { return  " Report Library";}
    public String getPrestamoFallido() { return "Could not make the loan. Check the book's availability and the user's active loans."; }
}