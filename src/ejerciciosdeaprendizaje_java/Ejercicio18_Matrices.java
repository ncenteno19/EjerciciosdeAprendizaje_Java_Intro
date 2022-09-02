/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeaprendizaje_java;

/**
 *
 * @author cynth
 */
public class Ejercicio18_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("MATRIZ");
        int [][] matriz =  new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random () * 10);
            }              
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("TRASPUESTA");
        
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        
    }
    
}
