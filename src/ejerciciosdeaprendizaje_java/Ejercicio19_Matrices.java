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
public class Ejercicio19_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matriz = new int [3][3];
        
        matriz [0][0] = 0;
        matriz [0][1] = -2;
        matriz [0][2] = 4;
        matriz [1][0] = 2;
        matriz [1][1] = 0;
        matriz [1][2] = 2;
        matriz [2][0] = -4;
        matriz [2][1] = -2;
        matriz [2][2] = 0;
                
     /*   for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random()*10);
            }
        }*/
        
       
         System.out.println("MATRIZ");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
         
         System.out.println("TRASPUESTA");
         for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
         
         int cuenta = 0;
         
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 if (matriz[i][j] == - matriz[j][i]){
                 cuenta++;
                 }
             }
            
        }
         
         if (cuenta == 9){
             System.out.println("La matriz es anti simétrica");
         } else{
            System.out.println("La matriz NO es anti simétrica");
         }
         
       
    }
    
}
