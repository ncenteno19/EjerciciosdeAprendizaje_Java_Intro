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
public class Ejercicio4 {

    /**
     * 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente
     * en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese los grados");
        
        double grados = leer.nextDouble();
        
        System.out.println("Grados F = " + (32+(9*grados / 5)));
        
    }
    
}
