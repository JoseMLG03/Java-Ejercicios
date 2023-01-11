package Calculado;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalculadoraObjeto Menu = new CalculadoraObjeto();
        Menu.metodoMenu();
        int op = sc.nextInt();

        switch (op) {
            case 1 -> {
                CalculadoraObjeto Suma = new CalculadoraObjeto();
                Suma.metodoSuma();
            }
            case 2 -> {
                CalculadoraObjeto Resta = new CalculadoraObjeto();
                Resta.metodoResta();
            }
            case 3 -> {
                CalculadoraObjeto Multiplicacion = new CalculadoraObjeto();
                Multiplicacion.metodoMultiplicacion();
            }
            case 4 -> {
                CalculadoraObjeto Division = new CalculadoraObjeto();
                Division.metodoDivision();
            }
        }
    }}