/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeaprendizaje_java;

import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class Ejercicio3 {

    /**
     * 3. Escribir un programa que pida una frase y la muestre toda en
     * mayúsculas y después toda en minúsculas. Nota: investigar la función
     * toUpperCase() y toLowerCase() en Java.
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        System.out.println(frase.toLowerCase());
        
        System.out.println(frase.toUpperCase());
        
                
        
                
    }
    
}
