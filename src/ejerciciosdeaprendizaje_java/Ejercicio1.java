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
public class Ejercicio1 {

    /**
     * 1. Escribir un programa que pida dos números enteros por teclado y
     * calcule la suma de los dos. El programa deberá después mostrar el
     * resultado de la suma
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("La suma es :" + (num1+num2));
        
        
    }
    
}
