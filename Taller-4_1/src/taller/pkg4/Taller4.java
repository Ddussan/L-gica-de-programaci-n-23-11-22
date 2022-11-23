/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg4;

import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class Taller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /**
    Realizar un programa que calcule el valor a pagar por algunos galones de gasolina
    * si sabemos que cada litro de gasolina vale 9.500.Imprimir la cantidad de galones, precio por galón, cantidad de litros y precio a pagar.
     * @param args
     * DE:Número de Galones
     * DS Cantidad de galones, precio, cantidad de litros y precio total.
     */
         
          Scanner leer = new Scanner(System.in);
     double gasliter;
    
     System.out.println("Ingrese cantidad de galones a comprar");
      double gallons = leer.nextDouble();
     
     gasliter= gallons * 3.785;
          System.out.println("La Cantidad de galones es de:\n"+gallons);
          System.out.println("Los litros totales serían\n"+gasliter);
          System.out.println("El precio total a pagar sería\n"+gasliter*9500);
          System.out.println("El precio por Galon sería 35625\n");
    
  
    }
    
}
