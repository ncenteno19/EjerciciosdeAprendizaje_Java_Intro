/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *

*/
package ejerciciosdeaprendizaje_java;

import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
        System.out.println("Ingrese la dimensión del cuadrado");
        
        int i, j;
        i=0;
        j=0;
        int num = leer.nextInt();

        for (i = 0; i < num; i++) {

            System.out.print("*" + " ");

        }

        System.out.println("");

        for (j = 2; j < num ; j++) {

            for (i = 0; i < num; i++) {

                if (0 < i && i < num - 1) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print("*" + " ");
                }
                
            }
           System.out.println("");            
        }
        
        
        for (i = 0; i < num; i++) {

            System.out.print("*" + " ");

        }
        
        
       System.out.println("");
    }
    
}
