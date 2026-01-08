/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operacion;
        System.out.println("ingrese el area que desea calcular,(1) para cuadrado"
                + " (2) para triangulo, (3) para rectangulo");
        operacion = entrada.nextInt();
        if (operacion == 1) {
            cuadrado();
        } else if (operacion == 2) {
            triangulo();
        } else if (operacion == 3) {
            rectangulo();
        } else {
            System.out.println("ingrese un valor correspondiente a la operacion porfavor");
        }
    }
    public static void cuadrado(){
        System.out.println("ingrese el tamaño de los lados");
        double lado= entrada.nextInt();
        double area= lado*lado;
        System.out.printf("el area del cuadrado sera: %s", area);
    }
     public static void rectangulo(){
        System.out.println("ingrese el tamaño de la altura");
        double lado= entrada.nextInt();
        System.out.println("ingrese el tamaño de la base");
        double base= entrada.nextInt();
        double area= (lado*base);
        System.out.printf("el area del rectangulo sera: %s", area);
        
    }
      public static void triangulo(){
        System.out.println("ingrese el tamaño de la altura");
        double lado= entrada.nextInt();
        System.out.println("ingrese el tamaño de la base");
        double base= entrada.nextInt();
        double area= (lado*base)/2;
        System.out.printf("el area del triangulo sera: %s", area);
    }
}
