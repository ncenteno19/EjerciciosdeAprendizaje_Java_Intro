/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*14. Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €*/

package ejerciciosdeaprendizaje_java;

import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); /*Para leer String frase después de un entero, por ejemplo y no tener que poner un nextLine, o saltar línea, o algún otro inconveniente de lectura
*/

        System.out.println("Ingrese tipo de cambio (libras, dolar, yenes)"); 
        
          
        String cadena = leer.nextLine();
        
        
        
        System.out.println("Ingrese la cantidad de €"); 
        double euro = leer.nextDouble();
        
        
         
        double retorno = convierte (euro, cadena);     
        System.out.println(retorno);
        
    }
    
    
    public static double convierte (double euro, String cadena){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        double calculo = 0;
        boolean opcion;

        do {
            switch (cadena) {

                case "libras":
                    calculo = 0.86 * euro;
                    opcion = true;
                    break;
                case "dolar":
                    calculo = 1.28611 * euro;
                    opcion = true;
                    break;
                case "yenes":
                    calculo = 129.852 * euro;
                    opcion = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    opcion = false;

                    System.out.println("Ingrese tipo de cambio (libras, dolar, yenes)");

                    cadena = leer.nextLine();
                    break;
            }

        } while (!opcion);
        return calculo;
    }
}
    


