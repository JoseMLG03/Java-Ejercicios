package Arrays;

import java.util.Scanner;

/*5. Crea un programa que pida cinco números reales por teclado, los almacene en un array
 y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores. */

public class _5_CincoNumerosMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        double numero[]= new double [5];

        for (int i = 0; i < 5; i++){
            System.out.println("Dame el valor Nº" + (i+1) + ": ");
            numero [i] = sc.nextDouble();
        }







    }
}
