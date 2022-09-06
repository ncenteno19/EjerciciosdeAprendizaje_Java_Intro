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
public class Ejercicio20_Matrices_CuadradoMágico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
      
        System.out.println("Ingrese el tamaño del cuadrado");
        int tamaño = leer.nextInt();
        
        int[][] matriz = new int [tamaño][tamaño];
        
        //FIJA
       /* matriz [0][0] = 2 ;
        matriz [0][1] = 7;
        matriz [0][2] = 6;
        matriz [1][0] = 9;
        matriz [1][1] = 5;
        matriz [1][2] = 1;
        matriz [2][0] = 4;
        matriz [2][1] = 3;
        matriz [2][2] = 8;*/
      
        
        //RANDOM
        
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz [i][j] = (int) (Math.random()*10);
            }
        }
        
        
       //POR TECLADO
       
       /* for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {

                System.out.println("Ingrese un numero del 1 al 9 para la posición [" + i + "] [" + j + "] de la matriz");
                matriz[i][j] = leer.nextInt();

                while (matriz[i][j] < 0 || matriz[i][j] > 9) {
                    System.out.println("El valor ingresado no es correcto. Ingrese nuevamente un numero entre el 1 y el 9");
                    matriz[i][j] = leer.nextInt();

                }

            }
        }*/
        
        System.out.println("MATRIZ");
        
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        
        //suma filas
        
        int cuentaF = 1;
        int aux = 0;
        
        for (int i = 0; i < tamaño; i++) {
            int suma = 0;
            for (int j = 0; j < tamaño; j++) {
                
                suma+=matriz[i][j];
                               
            }
            System.out.println("Fila "+i + "= "+suma);
            
                        
            if (aux==suma){
            cuentaF++;
            }
            aux = suma;
        }
        
       // System.out.println("CuentaF= "+ cuentaF);
        
        
       //Suma Columnas
       
       
       int cuentaC = 1;
       aux = 0; 
       
        for (int j = 0; j < tamaño; j++) {
           int suma = 0; //SE INTENTÓ USAR SUMA SIN DECLARAR YA QUE ESTABA EN EL FOR ANTERIOR POR QUÉ NO LO TOMA?
            for (int i = 0; i < tamaño; i++) {
                suma+=matriz[i][j];
            }
            
            System.out.println("Columna "+ j + "= "+suma);
            if (aux == suma){
            
                cuentaC++;
            }
            aux = suma;
            
        }
       
       // System.out.println("CuentaC= "+ cuentaC);
       
       
       
       //Suma diagonales
       
       int cuentaD = 1 ;
      aux=0; 
       int suma = 0;
        for (int i = 0; i < tamaño; i++) {
            
            for (int j = 0; j < tamaño; j++) {
                
                if(i==j){
                suma+=matriz[i][j];                                 
                }         
            }
             
        }
        System.out.println("Diagonal Principal =" + suma);
       
         aux = suma;
         
         suma=0;
       
         int j = 0;
         
         for (int i = tamaño-1; i > -1; i--) {
          
           suma += matriz[i][j];
           
           j++;
           
        }
        
        System.out.println("Diagonal Secundaria =" + suma);
       
       if (aux == suma){
       
           cuentaD++;
       
       }
       
       
       
        //System.out.println("CuentaD= "+ cuentaD);
       
       
        if ((cuentaC+ cuentaD + cuentaF) == ((tamaño*2)+2)){
        
            System.out.println("LA MATRIZ ES MÁGICA");
        }
        else{
         System.out.println("La matriz NO es mágica");
        }
       
       
       
        
    }
    
}
