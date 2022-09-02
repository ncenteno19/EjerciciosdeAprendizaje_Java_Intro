/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido*/

package ejerciciosdeaprendizaje_java;

import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class Ejercicio16_Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = leer.nextInt();
        
        int vector[] = new int [tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            
            vector[i] = (int) (Math.random() * 10);
                
        }
        
        System.out.println("Qué número desea buscar?");
        int buscar = leer.nextInt();
        
        
        int rep = 0;
        
        for (int i = 0; i < tamaño; i++) {
            
            if (vector[i] == buscar && rep == 0){
                System.out.println("El número se encuentre en el vector[" + i + "]");
                rep++;
            } 
            else if (vector[i] == buscar && rep > 0){
                System.out.println("Se encuentra repetido en el vector[" + i + "]");
            }
            
            
        }
        
        
        
    }
    
}
