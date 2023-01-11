package Arrays;

import java.util.Scanner;
/*1. Crea un programa que pida diez números reales por teclado, los almacene en un array,
 y luego muestre todos sus valores.*/
public class _1_DiezNumerosMostrarMetodos {public static void main(String[] args) {
    double numero[]= new double [10];
    Scanner sc = new Scanner((System.in));

    _1_DiezNumerosMostrarMetodos x = new _1_DiezNumerosMostrarMetodos();
    x.metodoRellenar(numero,sc);
    x.metodoMostrar(numero);

}
public static void metodoRellenar(double numero[],Scanner sc){
    for (int i = 0; i < 10; i++){
        System.out.println("Dame el valor " + (i+1) + ": ");
        numero [i] = sc.nextDouble();
    }
}
public static void metodoMostrar(double numero[]){
    for (int i = 0; i < 10; i++) {
        System.out.println("El valor de " + (i+1) + " es -> "+ numero [i]);
    }
}
}

