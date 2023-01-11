package ProblemaDeNumeroMinMaxMedia;

import java.util.Scanner;

public class ObjNumeroMinMaxMed {

    public int Acum;

    public int Cont;

    public int numero = 0;

    public boolean numeroprimo = false;

    public int maximo;
    public int minimo;

    public void metodoPrimo() {

        if (numero > 0) {
            do {
                if (numero % 2 == 0) {
                    if (numero > 2) {

                        numeroprimo = true;

                    } else {
                        System.out.println("Introduzca otro numero, si desea finalizar, introduzca un primo");
                        Scanner sc = new Scanner(System.in);
                        numero = sc.nextInt();

                        Acum = Acum + numero;
                        Cont = Cont + 1;
                        maximo = Integer.MIN_VALUE;
                        minimo = Integer.MIN_VALUE;
                    }
                }
            } while (!numeroprimo);
        } else {

            System.out.println("Introduzca un numero positivo");

        }
        System.out.println("El mínimo es: "+minimo+" El maximo es: "+maximo+" La media es: "+(Acum/Cont)+" El total es "+numero );
    }
}
