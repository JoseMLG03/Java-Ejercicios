package CajaFuerte;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int nuevaContrasena;
        boolean verificacion=false;
        boolean verificacionNuevaContrasena;
        boolean verificacionmenu=false;
        boolean VerificadorContr=false;
        boolean verificacionfinmenu=false;
        boolean verificacionsalir=false;

        System.out.println("Introduzca la contraseña de la caja fuerte (6 dígitos)");
        numero = sc.nextInt();

        //introduccion de contraseña
        do {
        if (numero < 999999) {

            verificacion=true;
        }else{
            System.out.println("Ese numero tiene mas de 6 digitos,porfavor introduzca otro");
            numero =sc.nextInt();
        }
        }while (!verificacion);

        String numCadena = Integer.toString(numero);

        //añadir 0s
        do {
            if(numCadena.length() >=6){

                verificacionmenu=true;

            }else {
                numCadena=numCadena+0;

            }
        }while (!verificacionmenu);

        numero = Integer.parseInt(numCadena);

        //Menú
        do {
        if (verificacionmenu){
        System.out.println("Bienvenido al menu de la caja fuerte de contraseña: " +numero);
        System.out.println("1.Introducir combinacion nueva");
        System.out.println("2.Valorar combinación");
        System.out.println("3.Salir");
        int seleccion = sc.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Introduzca la nueva contraseña");
                nuevaContrasena = sc.nextInt();
                do {
                    if (numero != nuevaContrasena) {

                        verificacionNuevaContrasena = true;

                    } else {

                        System.out.println("Introduzca una contraseña que no sea igual a la anterior");
                        nuevaContrasena = sc.nextInt();
                        verificacionNuevaContrasena = false;

                    }
                } while (!verificacionNuevaContrasena);
                numero=nuevaContrasena;
                //introduccion de contraseña
                do {
                    if (numero < 999999) {

                        verificacion=true;

                    }else{
                        System.out.println("Ese numero tiene mas de 6 digitos,porfavor introduzca otro");
                        numero =sc.nextInt();
                    }
                }while (!verificacion);

                numCadena = Integer.toString(numero);
                //Añadir0s
                boolean verificacionsubmenu=false;
                do {
                    if(numCadena.length() >=6){

                        verificacionsubmenu=true;

                    }else {
                        numCadena=numCadena+0;

                    }
                }while (!verificacionsubmenu);
                numero = Integer.parseInt(numCadena);

                break;
            case 2:

                System.out.println("Verifique su contraseña escribiendola denuevo*");
                do {
                    int numeroVer = sc.nextInt();
                    if (numero == numeroVer) {

                        VerificadorContr = true;

                    } else {

                        System.out.println("Porfavor introduzca su contraseña para verificarla");

                    }
                } while (!VerificadorContr);
                System.out.println("Contraseña verificada satisfactoriamente");
                break;
            case 3:
                System.out.println("Saliendo...");
                verificacionsalir=true;
        }
        }else {

            System.out.println("error, introduzca un numero de 6 dígitos");
            verificacionsalir=true;
        }}while (!verificacionsalir);
}}