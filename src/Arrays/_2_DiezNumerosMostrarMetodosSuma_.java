package Arrays;

import java.util.Scanner;
/*2. Crea un programa que pida diez números reales por teclado,
 los almacene en un array, y luego muestre la suma de todos los valores.*/


public class _2_DiezNumerosMostrarMetodosSuma_ {public static void main(String[] args) {
    double numero[]= new double [10];
    Scanner sc = new Scanner((System.in));

    _2_DiezNumerosMostrarMetodosSuma_ x = new _2_DiezNumerosMostrarMetodosSuma_();
    x.metodoRellenar(numero,sc);
    x.metodoMostrar(numero);

}
    public void metodoRellenar(double numero[],Scanner sc){
        for (int i = 0; i < 10; i++){
            System.out.println("Dame el valor " + (i+1) + ": ");
            numero [i] = sc.nextDouble();
        }
    }
    public void metodoMostrar(double numero[]){
        double total = 0;
        for (int i = 0; i < 10; i++) {
            total = numero[i];

        }
        System.out.println("El valor total es de "+ total);
    }
}
