package Arrays;

import java.util.Scanner;

/*1. Crea un programa que pida diez números reales por teclado, los almacene en un array,
 y luego muestre todos sus valores.*/

public class _1_Dieznumerosmostrar {
    public static void main(String[] args) {
        double numero[]= new double [10];
        Scanner sc = new Scanner((System.in));

        for (int i = 0; i < 10; i++){
            System.out.println("Dame el valor " + (i+1) + ": ");
            numero [i] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de " + (i+1) + " es : "+ numero [i]);
        }
    }
}