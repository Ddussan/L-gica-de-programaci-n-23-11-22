
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author uestudiantes
 */
public class Ejercicio16 {

    /**
     * Dada las horas trabajadas por un empleado determinar cuánto gana semanalmente y mensualmente, si el trabajador debe trabajar mínimo 38h semanales y un máximo de 56h.
       Se debe pedir la cantidad de horas trabajadas y verificar que esté dentro del rango permitido
       también se debe pedir el precio de la hora.  Imprimir la cantidad de horas trabajadas y el pago.
       * DE: Horas trabajadas 
       * DS ganancia semanal y anual, precio de la hora 
     * @param args the command line arguments
     */
                     
    public static void main(String[] args) {
        // TODO code application logic here
      
       
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Digitar el número de horas trabajadas");
        int hours = leer.nextInt(); 
        if (hours<38){
            System.out.println("El número de Horas es insuficiente");
        System.exit(hours);
        }if(hours>56){
            System.out.println("Las horas exceden el número máximo ");
              System.exit(hours);
        }else{
            System.out.println("Digite el precio de la hora");
            float hourprice = leer.nextFloat();
            System.out.println("La ganancia semanal del trabajador es de"+hourprice * hours);
            System.out.println("La ganancia mensual del trabajador es de"+hourprice * hours * 4);
            
        }
        
        
    }
    
}
