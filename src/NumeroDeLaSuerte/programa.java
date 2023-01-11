package NumeroDeLaSuerte;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op; boolean confg=false; int numero; String Numcadena = null;
    
        System.out.println("Bienvenido al programa para saber si su numero es un numero de la suerte");
        //MENU
        do {
            System.out.println("Elija una opcion");
            System.out.println("1-Introducir numero");
            System.out.println("2-Valorar numero");
            System.out.println("3-Salir");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    numero = metodoGuardarNumero();
                    Numcadena = Integer.toString(numero);
                    System.out.println("Su numero ha sido guardado");
                }
                case 2 -> metodoContrastarNumero(Numcadena);
                case 3 -> {
                    System.out.println("Saliendo del programa");
                    confg = true;
                }
            }
        }while (!confg);

    }
    //METODOS
    public static int metodoGuardarNumero(){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduzca un numero para saber si es de la suerte");
        num = sc.nextInt();
        return num;
    }
    private static void metodoContrastarNumero(String Numcadena) {
        char posicion;
        int cont = 0;
        int contMal = 0;
        for (int i = 0; i < Numcadena.length(); i=i+1) {
            posicion = Numcadena.charAt(i);
            if (posicion == '3' || posicion == '7' || posicion == '8' || posicion == '9')
            {
                cont=cont+1;
            }
            if (posicion == '0' || posicion == '1' || posicion == '2' || posicion == '4' || posicion == '5' || posicion == '6' || posicion == '7')
            {
                contMal=contMal+1;
            }
        }
        if (cont>contMal){
            System.out.println("Su numero es afortunado");
        }else{
            System.out.println("Su numero es desafortunado");
        }
    }
}
