package edu.angel.nava.actividades.actividad1.models;

public class Car {

    private String modelo;

    private String marca;

    private int numeroPuertras;

    private String color;


/**
 * En este apartado nosotros veremos las variantes por las cual esta 
 * creado nuestro auto y las que le pedira al cliente a la hora de mostrar nuestro menu
 * 
 */



@Override

public String toString() {
    return "Car{" + 
           "modelo = '" + modelo + '\'' + 
           ", marca='" + marca + '\'' +
           ", numeroPuertas=" + numeroPuertras +
           ", color='" + color + '\'' +
           '}';
}



public Car(String modelo, String marca, int numeroPuertas, String color) {
    this.modelo = modelo;
    this.marca = marca;
    this.numeroPuertras = numeroPuertas;
    this.color = color;
}




public int getNumeroPuertas() {
    return numeroPuertras;
}


public void setNumeroPuertas(int numeroPuertas) {
    if(numeroPuertas<2 || numeroPuertas>5){
        throw new IllegalArgumentException("numero de puertas valido esta entre 2 y 5");

    }

    this.numeroPuertras = numeroPuertas;
}





public String getModelo(){return modelo;}


public void setModelo(String modelo) { this.modelo = modelo;}


public String getMarca(){return marca;}


public void setMarca(String marca){this.marca = marca;}


public String getColor (){return color;}


public void setColor(String color){this.color= color;}



}