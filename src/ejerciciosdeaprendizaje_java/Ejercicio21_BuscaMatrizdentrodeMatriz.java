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
public class Ejercicio21_BuscaMatrizdentrodeMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matrizM = new int [10][10];
        //int [][] matrizP = new int [3][3];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j]= (int) (Math.random()*100);
            }
        }
        
    
      /*  matrizM[0][0] = 36;
        matrizM[0][1] = 67;
        matrizM[0][2] = 5;
        matrizM[1][0] = 89;
        matrizM[1][1] = 75;
        matrizM[1][2] = 90;
        matrizM[2][0] = 22;
        matrizM[2][1] = 14;
        matrizM[9][9] = 36;*/
        
        //***********************
        //caso de prueba positivo
       // int [][] matrizP = {{1,2,3},{2,3,4},{3,4,5}};
         int [][] matrizP = {{7,8,9},{8,9,10},{9,10,11}};
        // int [][] matrizP = {{14,15,16},{15,16,17},{16,17,18}};
        
        llenarMatrizPosi(matrizM);
        //fin caso prueba positivo
        //************************
        
       /* matrizM[4][4] = 36;
        matrizM[4][5] = 5;
        matrizM[4][6] = 67;
        matrizM[5][4] = 89;
        matrizM[5][5] = 90;
        matrizM[5][6] = 75;
        matrizM[6][4] = 14;
        matrizM[6][5] = 22;
        matrizM[6][6] = 26;
   
        matrizP[0][0] = 36;
        matrizP[0][1] = 5;
        matrizP[0][2] = 67;
        matrizP[1][0] = 89;
        matrizP[1][1] = 90;
        matrizP[1][2] = 75;
        matrizP[2][0] = 14;
        matrizP[2][1] = 22;
        matrizP[2][2] = 26;*/
        
        
        //Muestra MAtrizM
        
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                if (matrizM[i][j] < 10) {System.out.print(" | "+matrizM[i][j]+" |  ");}
                else{System.out.print(" | "+matrizM[i][j]+" | ");}
        }
            System.out.println(" ");
        }
        
    
       
                
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {

                        if (matrizP[0][0] == matrizM[k][l]) {
                        
                        
                        boolean  retorno = comprueba (matrizP, matrizM, k, l);           
                        
                        
                           if (retorno == true){
                          System.out.println("MatrizP[0][0] se encuentra en MatrizM [" + k + "][" + l + "]");
                           break;
                           } 
                           
                           else {
                               System.out.println("No se encuentró la matrizP en Matriz M");
                           }
                                                 

                        }

                    }
                }

   
    }
    
    
   public static boolean comprueba (int [][] matrizP, int [][] matrizM, int k , int l){
   
       boolean buscador = false;
       
       int cuenta = 0;
       
       int auxk = k; 
       int auxl= l;
       
       
       //se agrega el if por si la posición k+3 o l+3 supera el tamaño de la matriz de [10][10]
       if ((k + 3) > matrizM.length || (l + 3) > matrizM[k].length) {

           buscador = false;
       } 
       
       else {
           for (int m = k; m < k + 3; m++) {
               for (int n = l; n < l + 3; n++) {

                   //m-aux n - aux da la posición de la matrizP 
                   if (matrizP[m - auxk][n - auxl] == matrizM[m][n]) {

                       cuenta++;

                   }

               }
           }
       }
       
       //cuenta debe dar la cantidad de números en la matriz más pequeña (Averiguar sobre como usar length para contar las columnas y las filas)
       if (cuenta == matrizP.length*matrizP.length) {
           buscador = true;
       }

       return buscador;


   
   
   
   } 
   
   
    static void llenarMatrizPosi (int[][]m){
        for (int i = 0 ; i < m.length; i++){
            for (int j = 0 ; j < m[i].length; j++){
                m[i][j] = i+j;
            }
        }
    }
    
    
    
}
