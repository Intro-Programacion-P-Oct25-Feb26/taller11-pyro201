/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operacion;
        System.out.println("ingrese el valor que desea calcular,(1) planilla de luz"
                + " (2) predio de un inmueble ");
        operacion = entrada.nextInt();
        entrada.nextLine();
        if (operacion == 1) {
            System.out.println("ingrese su nombre y apellido");
            String name = entrada.nextLine();
            System.out.println("ingrese su numero de cedula");
            int cedu = entrada.nextInt();;
            planilla(name, cedu);
        } else if (operacion == 2) {
            System.out.println("ingrese su nombre y apellido");
            String name = entrada.nextLine();
            System.out.println("ingrese su numero de cedula");
            int cedu = entrada.nextInt();
            predio(name, cedu);
        } else {
            System.out.println("ingrese un valor correspondiente al valor que"
                    + " desea calcular");
        }
    }

    public static void planilla(String a, int b) {
        System.out.println("ingrese el valor del kilovatio");
        double precio = entrada.nextDouble();
        System.out.println("ingrese la catidad de kilovatios del mes");
        double kilov = entrada.nextDouble();
        double suma = precio * kilov;
        System.out.printf("Cliente %s con cedula %s debera cancelar el valor de $%s\n",
                a, b, suma);
    }

    public static void predio(String a, int b) {
        System.out.println("ingrese el valor de su inmueble");
        double precio = entrada.nextDouble();
        double predio = precio * .02;
        System.out.printf("Cliente %s con cedula %s tene un inmueble valorado en"
                + " $%s y tiene que pagar un predio de $%s\n",
                a, b, precio, predio);
    }
}
