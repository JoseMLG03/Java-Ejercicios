package Arrays;

import java.util.Scanner;
/*4. Crea un programa que pida cinco números enteros por teclado, los almacene en un array
y luego muestre por separado la suma de todos los valores positivos y negativos.*/
public class _4_CincoNumerosSumarNegativoPositivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        double numero[]= new double [5];
        double positivo;
        double negativo;
        double totalpositivo=0;
        double totalnegativo=0;

        for (int i = 0; i < 5; i++){
            System.out.println("Dame el valor Nº" + (i+1) + ": ");
            numero [i] = sc.nextDouble();
        }

        for (int i = 0; i < 5; i++){
            if (numero [i]>0){
                positivo=numero[i];
                totalpositivo+=positivo;
            }
            if (numero [i]<0){
                negativo=numero[i];
                totalnegativo+=negativo;
            }
        }

        System.out.println("El resultado positivo es: "+totalpositivo);
        System.out.println("El resultado negativo es: "+totalnegativo);

    }
}


