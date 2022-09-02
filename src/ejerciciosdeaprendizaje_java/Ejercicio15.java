/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente*/
package ejerciciosdeaprendizaje_java;

import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int [] vector = new int [100];
        
        int i;
        
        for ( i = 0; i < 100; i++) {
            vector[i] = i;
        }
        
                            
             
       for (i = 99; i > -1 ; i--) {
        
                   System.out.println(vector[i]);
        }
    }
    
}
