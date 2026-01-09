/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String[] ciudades = matriz_ciu();
        imprimir(ciudades);

    }

    public static String[] matriz_ciu() {
        int val;
        System.out.println("Ingrese el número de elementos del arreglo");
        val = entrada.nextInt();

        entrada.nextLine();
        String[] city = new String[val];
        for (int i = 0; i < city.length; i++) {
            System.out.println("Ingrese el nombre de las ciudades");
            city[i] = entrada.nextLine();
        }
        return city;
    }

    public static void imprimir(String[] a) {
        System.out.println("Ciudades con 4 o 5 caracteres:");
        for (int i = 0; i < a.length; i++) {
            int condi = a[i].length();
            if ((condi == 4) || (condi == 5)) {
                System.out.println(a[i]);
            }
        }

    }
}
