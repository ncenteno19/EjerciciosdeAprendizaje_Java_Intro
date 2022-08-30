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
public class Ejercicio5 {

    /**
     * 5. Escribir un programa que lea un número entero por teclado y muestre
     * por pantalla el doble, el triple y la raíz cuadrada de ese número. Nota:
     * investigar la función Math.sqrt().
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Escriba un numero");
        
        int num = leer.nextInt();
        
        System.out.println("Doble: " + num*2);
        System.out.println("Triple: " + num*3);
        System.out.println("Raiz Cuadrada: " + Math.sqrt(num));
    }
    
}
