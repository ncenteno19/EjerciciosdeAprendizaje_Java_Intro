/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeaprendizaje_java;

//import java.util.Random; averiguar
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class Ejercicio23_EXTRA_SopadeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int tamM = 20;
        String [][] sopa = new String [tamM][tamM];
        
        LlenaMatriz (sopa);
        
        IngresePalabras(sopa);
        
        MostrarMatriz(sopa);
    
    }
 
    
    //se llena la matriz con números
    public static void LlenaMatriz (String [][]  matriz){
        
       // Random r = new Random(); averiguar sobre esta cosa
        
               
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                matriz[i][j] = String.valueOf((int) (Math.random()*10));
                        
                               
            }
            
        }
    
    }
    
    
   public static void MostrarMatriz (String [][]  matriz){ 
   
        //otra manera de mostrar la matriz 
       for(String [] fila: matriz){
       String aux = "";
        // para cada elemento de la fila
       for(String elemento: fila){
       aux+= " " + elemento;
       }
           System.out.println(aux);
       }
       
       
   }
    
    public static void IngresePalabras(String[][] matriz) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese 5 palabras de entre 3 y 5 caracteres");
        for (int i = 0; i < 5; i++) {

            String palabra = leer.nextLine();
            palabra = palabra.toUpperCase();
            if (palabra.length() > 2 && palabra.length() < 6) {
                
                AddWord(matriz,palabra);
                
            } else {

                do {
                    System.out.println("ERROR. La palabra debe ser entre 3 y 5 caracteres");
                    palabra = leer.nextLine();
                    palabra = palabra.toUpperCase();
                } while (palabra.length() < 3 || palabra.length() > 5);
           
                AddWord(matriz,palabra);
            }

        }

    }
    
    
    
    
    public static void AddWord(String [][] matriz, String palabra){
        
        int posicionesI [] = new int [5];
        
        do {
        //posición i j aleatorio entre 0 y 19 (largo de matriz)
        int i = (int) (Math.random()* (matriz.length-1)); 
        
        int pos = (int) (Math.random()* (matriz[i].length-1));
        
        
        //si la posición más el alrgo de la pabra supera el límete de la matriz, vuelve a tirar la posición
        while (pos + palabra.length() > matriz.length-1){
        pos = (int) (Math.random()* (matriz[i].length-1));
        }
        }
        
        while (posicionUsada(i,pos));
        
        posicionesI
        
        
        
        int aux = 0; // para que recorra la palabra
        
        for (int j = pos; j < pos+palabra.length(); j++) {
                  
            matriz[i][j] = palabra.substring(aux,aux+1);
            aux++;
            
        }
        
    
    
    
    
    }
    
    
    
    
    
    public static void posicionUsada(i,pos){
    
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
