package ProblemaDeNumeroMaxMediaSinprimo;

import java.util.Scanner;

public class Clase {

    public int MediaImpar;

    public int Numero;

    public int Acum;
    public int Cont;

    public int max;

    public void metodoScanner(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzcanumero");
        Numero = sc.nextInt();
    }

    public void metodoConteoMedia(){
        if (Numero % 2 == 1){
            Cont=Cont+1;
            Acum=Acum+Numero;
            System.out.println(Numero);
        }}
    public void metodoPares() {
        {
            if (Numero % 2 == 0) {
                max = Integer.MAX_VALUE;
                System.out.println(Numero);
            }
        }
    }}
