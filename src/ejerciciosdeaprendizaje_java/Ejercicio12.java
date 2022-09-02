/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals()*/


package ejerciciosdeaprendizaje_java;

import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String codigo;
        int correcto, incorrecto;
        correcto = 0;
        incorrecto = 0;
            
        do{
        
            System.out.println("Ingrese código");
            codigo = leer.nextLine();
            codigo=codigo.toUpperCase();
            
            if (codigo.substring(0,1).equals("X") && codigo.substring((codigo.length()-1),codigo.length()).equals("O") && codigo.length()== 5){
                System.out.println("Correcto");
                correcto++;
            } else  if (!codigo.equals("&&&&&")){
                System.out.println("Incorrecto");
                incorrecto++;
            } 
            
                        
        } while (!codigo.equals("&&&&&"));
        
        System.out.println("Candidad de Correctos: " + correcto);
        System.out.println("Candidad de Incorrectos: " + incorrecto);
        
  }
    
}
