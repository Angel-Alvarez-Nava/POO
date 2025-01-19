package edu.angel.nava.actividades.actividad1.process;

import java.util.ArrayList;

import edu.angel.nava.actividades.actividad1.models.Car;

public class StockManager {
    ArrayList<Car> stock;



    public StockManager(){
        this.stock = new ArrayList<>();
    }





    /**
     * genera un nuevo objeto de la informacion de un auto y se agrega 
     * al catalogo de la aplicacion
     * @param modelo el año del auto
     * @param marca empresa productora del carro
     * @param numeroPuertas
     * @param color Blanco y Gris
     */



    public void addCar(String modelo, String marca, int numeroPuertas, String color){
        Car car = new  Car(modelo,marca,numeroPuertas,color);
        stock.add(car);
    }


    /**
     * 
     * @return devuelve un alista con todo el catalogo en
     */




    public void printStock(){
        System.out.print("El catalogo actual es:  ");
        System.out.println(stock);
    }
}
  