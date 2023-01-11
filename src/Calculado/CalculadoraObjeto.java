package Calculado;

import java.util.Scanner;

public class CalculadoraObjeto {

    int suma;
    int resta;
    int multiplicacion;
    int division;

    public CalculadoraObjeto(){}
    public void metodoMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Seleccione la operacion que desea realizar ");
        System.out.println(" 1=Suma - 2=Resta - 3=Multiplicacion - 4=Division ");

    }
    public void metodoSuma(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 2 numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        suma= num1+num2;
        System.out.println("El resultado es " + suma);
    }
    public void metodoResta(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 2 numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        resta= num1-num2;
        System.out.println("El resultado es " + resta);
    }
    public void metodoMultiplicacion(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 2 numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        multiplicacion= num1*num2;
        System.out.println("El resultado es " + multiplicacion);
    }
    public void metodoDivision(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 2 numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        division= num1/num2;
        System.out.println("El resultado es " + division);
    }
    }

