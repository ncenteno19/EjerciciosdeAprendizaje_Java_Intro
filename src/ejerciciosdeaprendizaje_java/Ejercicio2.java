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
public class Ejercicio2 {

    /**
     * 2. Escribir un programa que pida tu nombre, lo guarde en una variable y
     * lo muestre por pantalla
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese su nombre");
        
        String nombre = leer.next();//nextline() si es una cadena 
        
        System.out.println("La variable nombre es : " + nombre);
    }
    
}
