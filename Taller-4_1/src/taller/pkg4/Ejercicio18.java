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
public class Ejercicio18 {

    /**
     * .Realizar un algoritmo que calcule el salario a pagar de un empleado según los siguientes parámetros
     * : •Si gana menos de 700.000, descuento de pensión =-2%, descuento de salud =-4% y más Aux. de transporte= +11%.
     * •Si gana entre 741.000 y 999.999, descuento de pensión =-4%, descuento de salud =-6% y más Aux. de transporte= +9%.
     * •Si gana más 1.000.000y menos 1.800.00, descuento por pensión es -6%, descuento de segurode vida 5%, descuento de salud =-6% y más Aux. de transporte= +9%.
     * •Si gana más de 1.800.000 y menos de 2.500.00, descuento por pensión es -6%, descuento de seguro de vida 5%, descuento de salud =-8% y más Aux. de transporte= +8%.
     * •Si gana más de 2.500.000, descuento por pensión es -8%, descuento de seguro de vida 6%, descuento de salud =-10% y más Aux. de transporte= +9%
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite salario");
        float salary = leer.nextFloat();
        if(salary<=700000){
            double fsalary = salary*0.05+salary;
            System.out.println("El salario final es"+fsalary);
        }
        if(salary>=741000){
            if(salary<=999999){
                double fsalary = salary*-0.01+salary;
                System.out.println("El salario final es"+fsalary);
                
            }
            if (salary>=1000000){
                if (salary<1800000){
                    double fsalary = salary*0.02+salary;
                    System.out.println("El salario final es"+fsalary);
                   
                }
                if (salary>1800000){
                    if (salary<=2500000){
                        double fsalary = salary*-0.01+salary;
                        System.out.println("El salario final es"+fsalary);
                    }
                    if (salary>=2500000){
                        double fsalary = salary*-0.03+salary;
                        System.out.println("El salario final es"+fsalary);
                    }
                }
            }
        }
        
    }
    
}
