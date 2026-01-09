/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] sumaf = sumas(informacion, informacion2);
        presentar(sumaf);
    }

    public static int[][] sumas(int[][] a, int[][] b) {
        int[][] suma = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int c = 0; c < a[i].length; c++) {
                int z = a[i][c] + b[i][c];
                suma[i][c] = z;
            }
        }
        return suma;
    }
    public static void presentar(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int c = 0; c < a[i].length; c++) {
                System.out.printf("%s\t ",a[i][c]);
            }
            System.out.println("");
        }
    }
}
