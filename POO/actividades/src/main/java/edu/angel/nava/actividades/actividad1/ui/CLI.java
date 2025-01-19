package edu.angel.nava.actividades.actividad1.ui;

import java.util.Scanner;

import edu.angel.nava.actividades.actividad1.process.StockManager;

public class CLI {


    /**
     * En este apartado veremos lo que viene siendo nuestra composiscion 
     * del menu que se nos muestra al ejecutar el codigo 
     */


    public static void runApp(){
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();
        showMenu();
        int opcion = scanner.nextInt();scanner.nextLine();



        while (opcion!=3){
            switch (opcion){
                case 1:


                    System.out.println("Introduce el numero de puertas");
                    int numPuertas = scanner.nextInt();scanner.nextLine();
                    System.out.println("Introduce el color");
                    String color = scanner.nextLine();
                    System.out.println("Introduce el modelo");
                    String modelo = scanner.nextLine();
                    System.out.println("Introduce la marca");
                    String marca = scanner.nextLine();
                    System.out.println("Introduce  de cuantos cilindros lo quieres");
                    stockManager.addCar(modelo,marca,numPuertas,color);

                    break;
                case 2:
                    stockManager.printStock();
                    break;
                default:
                    System.out.println("opcion no valida");    
            }
            showMenu();
            opcion = scanner.nextInt();
        }
    }

    public static void showMenu(){
        System.out.println("""
                  Menu
                1. agregar Carro al catalogo
                2. mostrar catalogo
                3. Salir
                """);
    }

}