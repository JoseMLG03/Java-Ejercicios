package Examen;

import java.util.Scanner;

public class ExamenEjercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        byte op;
        String numero ="";

        System.out.println("Indica si el numero introducido es de la suerte o no");

        do {
            op = menu();

            switch (op) {
                case 1 -> numero = guardarNumero();
                case 2 -> valorarNumero(numero);
                case 3 -> System.out.println("Gracias por utilizarme");
            }
        } while (op != 3);
    }

    private static byte menu() {
        Scanner scan = new Scanner(System.in);
        byte opcion;

        do {
            System.out.println("Seleccione una opción: \n" +
                    "1) Introducir números \n" +
                    "2) Ver cálculos \n" +
                    "3) Salir");
            System.out.print("Opción: ");
            opcion = scan.nextByte();
        } while ((opcion < 1) || (3 < opcion));

        return opcion;
    }

    private static String guardarNumero() {
        Scanner scan = new Scanner(System.in);
        String numero; //guarda el número que introduce el usuario

        System.out.print("Introduzca el número que desea: ");
        numero = scan.nextLine();

        return numero;
    }

    private static void valorarNumero(String numero) {
        char posicion; //coge el caracter que este en cada posicion
        long cont = 0; //guarda cuantos numeros de la buena suerte tiene


        for (int i = 0; i < numero.length(); i++) {
            posicion = numero.charAt(i);
            //System.out.println(posicion);

            if (posicion == '3' || posicion == '7' || posicion == '8' || posicion == '9')
            {
                cont++;
                //System.out.println("Sumo 1");
            }
        }

        System.out.println("El numero " + numero + " tiene " + numero.length() + " cifras, " +
                "de las cuales " + cont + " son de buena suerte.");



    }
}









