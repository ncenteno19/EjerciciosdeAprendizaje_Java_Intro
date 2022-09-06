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
public class Ejercicio21_BuscaMatrizdentrodeMatriz_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random() * 100);
            }
        }

        /*   matrizM[0][0] = 36;
        matrizM[0][1] = 67;
        matrizM[0][2] = 5;
        matrizM[1][0] = 89;
        matrizM[1][1] = 75;
        matrizM[1][2] = 90;
        matrizM[2][0] = 22;
        matrizM[2][1] = 14;
        matrizM[2][2] = 26;*/
        
        matrizM[4][4] = 36;
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
        matrizP[2][2] = 26;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println("");
        }

        for (int k = 0; k < 10; k++) {
            for (int l = 0; l < 10; l++) {

                if (matrizP[0][0] == matrizM[k][l]) {

                    int cuenta = 0;
                    int aux = k;

                    for (int m = k; m < k + 3; m++) {
                        for (int n = l; n < l + 3; n++) {

                            if (matrizP[m - aux][n - aux] == matrizM[m][n]) {

                                cuenta++;

                            }

                        }
                    }

                    if (cuenta == 9) {
                        System.out.println("MatrizP[0][0] se encuentra en MatrizM [" + k + "][" + l + "]");
                    }

                }

            }
        }

    }

}

