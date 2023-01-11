package Examen;

import java.util.Scanner;

public class ExamenEjercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Acum98 = 0;
        double Acum98102 = 0;
        double Acum102 = 0;
        int Cont98 = 0;
        int Cont98102 = 0;
        int Cont102 = 0;
        double x = 0;
        
        do {
            System.out.println("Por favor ingrese el peso de las piezas que quiera recontar/pesar. Cuando quiera parar escriba 0 o -1");
            x = sc.nextDouble();
            if (x>0){
            if (x < 9.8) {
                Acum98 = Acum98 + x;
                Cont98 = Cont98 + 1;
            }
            if (x > 9.8 && x < 10.2) {
                Acum98102 = Acum98102 + x;
                Cont98102 = Cont98102 + 1;
            }
            if (x > 10.2) {
                Acum102 = Acum102 + x;
                Cont102 = Cont102 + 1;
            }}
        } while (x != 0 && x != -1);
        System.out.println("El numero total de piezas procesadas es: "+(Cont102+Cont98+Cont98102));
        System.out.println("Divido en: "+Cont98+" de menos de 9.8Kg, "+Cont98102+" entre 9.8Kg y 10.2Kg y "+Cont102+" de mas de 10.2Kg");
        System.out.println("El peso total de todas las piezas es de: "+(Acum98+Acum98102+Acum102));

    }}
