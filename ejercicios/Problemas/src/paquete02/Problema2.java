/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] casas = viviendas();
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] meses = consumo();
        double[] anual = año(meses);
        imprimir(casas, anual);
    }

    public static String[] viviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] casa = new String[10];
        for (int i = 0; 0 < casa.length; i++) {
            System.out.printf("ingrese el nombre de la casa");
            casa[i] = entrada.nextLine();
        }
        return casa;
    }

    public static double[][] consumo() {
        Scanner entrada = new Scanner(System.in);
        double[][] meses = new double[10][12];

        for (int i = 0; 0 < meses.length; i++) {
            for (int c = 0; 0 < meses[i].length; c++) {

                System.out.printf("ingrese el consumo mensual de la casa");
                meses[i][c] = entrada.nextDouble();
            }
        }
        return meses;
    }

    public static double[] año(double[][] m) {
        double[] anual = new double[10];
        for (int i = 0; 0 < m.length; i++) {
            double suma = 0;
            for (int c = 0; 0 < m[i].length; c++) {
                suma += m[i][c];
            }
            anual[i] = suma;
        }
        return anual;
    }

    public static void imprimir(String[] a, double[] b) {
        for (int f = 0; f < a.length; f++) {
            System.out.printf("la vivienda %s tiene un consumo anual de: %s\n",
                    a[f], b[f]);

        }
    }
}
