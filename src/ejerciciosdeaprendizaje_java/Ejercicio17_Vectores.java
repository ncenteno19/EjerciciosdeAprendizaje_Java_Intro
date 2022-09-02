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
public class Ejercicio17_Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
  
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = leer.nextInt();

        int[] vector = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {

            vector[i] = (int) (Math.random() * 100000);

        }

        int cuenta1 = 0;
        int cuenta2 = 0;
        int cuenta3 = 0;
        int cuenta4 = 0;
        int cuenta5 = 0;

        for (int i = 0; i < tamaño; i++) {

            if (vector[i] >= 0 && vector[i] < 10) {
                cuenta1++;
            } else if (vector[i] > 9 && vector[i] < 100) {
                cuenta2++;
            } else if (vector[i] > 99 && vector[i] < 1000) {
                cuenta3++;
            } else if (vector[i] > 999 && vector[i] < 10000) {
                cuenta4++;
            } else if (vector[i] > 999 && vector[i] < 10000) {
                cuenta4++;
            } else if (vector[i] > 9999 && vector[i] < 100000) {
                cuenta5++;
            }
        }
        System.out.println("Cantidad de Números de 1 dígito: " + cuenta1);
        System.out.println("Cantidad de Números de 2 dígito: " + cuenta2);
        System.out.println("Cantidad de Números de 3 dígito: " + cuenta3);
        System.out.println("Cantidad de Números de 4 dígito: " + cuenta4);
        System.out.println("Cantidad de Números de 5 dígito: " + cuenta5);
        

 }
}
  