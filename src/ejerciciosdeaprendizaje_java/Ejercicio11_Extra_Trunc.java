/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*11. Escribir un programa que lea un número entero y devuelva el número de dígitos que 
componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
de división. Nota: recordar que las variables de tipo entero truncan los números o 
resultados*/
package ejerciciosdeaprendizaje_java;

import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class Ejercicio11_Extra_Trunc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
         System.out.println("Ingrese un Número");
         
         int num = leer.nextInt();
         
        //double aux = num;
        
        int cuenta = 0;
         
        
        //hay dos maneras de hacerlo. se puede usar el auxiliar.
        // pero al declarar num como INT y dividirlo por 10 num queda con la parte entera de la división, o sea queda truncado.
         while(num>=1){
         
           // aux = Math.round(aux/10);
              num = num /10;
           cuenta++;  
             
         }
         
         System.out.println("El numéro tiene " + cuenta + " dígitos" );
         
    }
    
}
