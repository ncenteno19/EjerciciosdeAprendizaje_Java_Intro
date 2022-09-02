
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú*/


/*
package ejerciciosdeaprendizaje_java;

/**
 *
 * @author cynth
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        boolean salida = false;
       
        do {
            System.out.println("MENU");
            System.out.println("====");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
                       
            int opcion = leer.nextInt();
            
            switch (opcion){
                case 1:  
                    System.out.println("La suma es :" + (num1 + num2));
                    
                    break;
                case 2:
                    System.out.println("La resta es :" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es :" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división es :" + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Seguro que desea Salir? S/N");
                    String respuesta  = leer.next();
                    if (respuesta.equals("S")){
                    salida = true;
                    }
                    break;
                default: System.out.println("Ingrese una opción correcta");
                    
            }
            
        } while (!salida); //while (respuesta.equals("N"));
        
        System.out.println("Hasta Luego!!!");
        
    }
    
}
