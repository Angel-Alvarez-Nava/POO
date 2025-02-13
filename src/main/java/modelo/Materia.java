package modelo;

public class Materia {
    private String nombre;
    private String clave;
    private int creditos;
    private int horasSemanales;

    public Materia() {}
    public Materia(String nombre,String clave,int creditos,int horasSemanales){
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
    }
    public int getCreditos(){ return creditos;}
    public int getHorasSemanales(){return horasSemanales;}

    public String toString(){
        return nombre + " (" + clave + ") - " + creditos + " créditos, " + horasSemanales + " horas/P/semana";
    }
}
