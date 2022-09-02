
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
package ejerciciosdeaprendizaje_java;
*/
/**
 *
 * @author cynth
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
    
        System.out.println("Ingrese un Valor límite");
        
        int numlimite = leer.nextInt();
        int suma = 0;
        
    while (suma <= numlimite) {
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        suma += num;
    }
    
        System.out.println("Valor límite: " + numlimite);
        System.out.println("Valor suma: " + suma);
        
    
    }
    
}
