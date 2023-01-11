package GeneradorDeMelodia;

import java.util.Scanner;

public class GeneradorDeMelodia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //VARIABLES
        String nota1;
        String nota2;
        String nota3;
        String nota4;
        String nota5;
        String nota6;
        String nota7;
        String nota8;
        String nota9;
        String nota10;
        String nota11;
        String nota12;
        String nota13;
        String nota14;
        String nota15;
        String nota16;
        String nota17;
        String nota18;
        String nota19;
        String nota20;
        String nota21;
        String nota22;
        String nota23;
        String nota24;
        String nota25;
        String nota26;
        String nota27;
        int repeticionCompas;

        //SELECTOR ALEATORIO DE NUMERO DE COMPASES
        repeticionCompas = metodoCompases();
        // 1 COMPÁS
        if (repeticionCompas == 4) {
            nota1 = metodoSelectorNotas();
            nota2 = metodoSelectorNotas();
            nota3 = metodoSelectorNotas();

            System.out.println(nota1 + " " + nota2 + " " + nota3 + " " + nota1 + " ||");
        }
        //2 COMPASES
        if (repeticionCompas == 8) {
            nota1 = metodoSelectorNotas();
            nota2 = metodoSelectorNotas();
            nota3 = metodoSelectorNotas();
            nota4 = metodoSelectorNotas();
            nota5 = metodoSelectorNotas();
            nota6 = metodoSelectorNotas();
            nota7 = metodoSelectorNotas();

            System.out.println(nota1 + " " + nota2 + " " + nota3 + " " + nota4 + " | " + nota5 + " " + nota6 + " " + nota7 + " " + nota1 + " ||");
        }
        //3 COMPASES
        if (repeticionCompas == 12) {
            nota1 = metodoSelectorNotas();
            nota2 = metodoSelectorNotas();
            nota3 = metodoSelectorNotas();
            nota4 = metodoSelectorNotas();
            nota5 = metodoSelectorNotas();
            nota6 = metodoSelectorNotas();
            nota7 = metodoSelectorNotas();
            nota8 = metodoSelectorNotas();
            nota9 = metodoSelectorNotas();
            nota10 = metodoSelectorNotas();
            nota11 = metodoSelectorNotas();

            System.out.println(nota1 + " " + nota2 + " " + nota3 + " " + nota4 + " | " + nota5 + " " + nota6 + " " + nota7 + " " + nota8 +" | "+ nota9 + " " + nota10 + " " + nota11 +" "+ nota1 + " ||");
        }
        //4 COMPASES
        if (repeticionCompas == 16) {
            nota1 = metodoSelectorNotas();
            nota2 = metodoSelectorNotas();
            nota3 = metodoSelectorNotas();
            nota4 = metodoSelectorNotas();
            nota5 = metodoSelectorNotas();
            nota6 = metodoSelectorNotas();
            nota7 = metodoSelectorNotas();
            nota8 = metodoSelectorNotas();
            nota9 = metodoSelectorNotas();
            nota10 = metodoSelectorNotas();
            nota11 = metodoSelectorNotas();
            nota12 = metodoSelectorNotas();
            nota13 = metodoSelectorNotas();
            nota14 = metodoSelectorNotas();
            nota15 = metodoSelectorNotas();

            System.out.println(nota1 + " " + nota2 + " " + nota3 + " " + nota4 + " " + "| " + nota5 + " " + nota6 + " " + nota7 + " " + nota8 +" | "+ nota9 + " " + nota10 + " " + nota11 + " " + nota12 + " | " + nota13 + " " + nota14 + " " + nota15 + " " + nota1 + " ||");
        }
        //5 COMPASES
        if (repeticionCompas == 20) {
            nota1 = metodoSelectorNotas();
            nota2 = metodoSelectorNotas();
            nota3 = metodoSelectorNotas();
            nota4 = metodoSelectorNotas();
            nota5 = metodoSelectorNotas();
            nota6 = metodoSelectorNotas();
            nota7 = metodoSelectorNotas();
            nota8 = metodoSelectorNotas();
            nota9 = metodoSelectorNotas();
            nota10 = metodoSelectorNotas();
            nota11 = metodoSelectorNotas();
            nota12 = metodoSelectorNotas();
            nota13 = metodoSelectorNotas();
            nota14 = metodoSelectorNotas();
            nota15 = metodoSelectorNotas();
            nota16 = metodoSelectorNotas();
            nota17 = metodoSelectorNotas();
            nota18 = metodoSelectorNotas();
            nota19 = metodoSelectorNotas();

            System.out.println(nota1 + " " + nota2 + " " + nota3 + " " + nota4 + " | " + nota5 + " " + nota6 + " " + nota7 + " " + nota8 +" | "+ nota9 + " " + nota10 + " " + nota11 + " " + nota12 + " | " + nota13 + " " + nota14 + " " + nota15 + " " + nota16 +" | " + nota17 + " " + nota18 + " " + nota19 + " " + nota1 + " ||");
        }
        //6 COMPASES
        if (repeticionCompas == 24) {
            nota1 = metodoSelectorNotas();
            nota2 = metodoSelectorNotas();
            nota3 = metodoSelectorNotas();
            nota4 = metodoSelectorNotas();
            nota5 = metodoSelectorNotas();
            nota6 = metodoSelectorNotas();
            nota7 = metodoSelectorNotas();
            nota8 = metodoSelectorNotas();
            nota9 = metodoSelectorNotas();
            nota10 = metodoSelectorNotas();
            nota11 = metodoSelectorNotas();
            nota12 = metodoSelectorNotas();
            nota13 = metodoSelectorNotas();
            nota14 = metodoSelectorNotas();
            nota15 = metodoSelectorNotas();
            nota16 = metodoSelectorNotas();
            nota17 = metodoSelectorNotas();
            nota18 = metodoSelectorNotas();
            nota19 = metodoSelectorNotas();
            nota20 = metodoSelectorNotas();
            nota21 = metodoSelectorNotas();
            nota22 = metodoSelectorNotas();
            nota23 = metodoSelectorNotas();

            System.out.println(nota1 + " " + nota2 + " " + nota3 + " " + nota4 + " | " + nota5 + " " + nota6 + " " + nota7 + " " + nota8 +" | "+ nota9 + " " + nota10 + " " + nota11 + " " + nota12 + " | " + nota13 + " " + nota14 + " " + nota15 + " " + nota16 +" | " + nota17 + " " + nota18 + " " + nota19 + " " + nota20 +" | " + nota21 + " " + nota22 + " " + nota23 +" "+ nota1 + " ||");
        }
        //7 COMPASES
        if (repeticionCompas == 28) {
            nota1 = metodoSelectorNotas();
            nota2 = metodoSelectorNotas();
            nota3 = metodoSelectorNotas();
            nota4 = metodoSelectorNotas();
            nota5 = metodoSelectorNotas();
            nota6 = metodoSelectorNotas();
            nota7 = metodoSelectorNotas();
            nota8 = metodoSelectorNotas();
            nota9 = metodoSelectorNotas();
            nota10 = metodoSelectorNotas();
            nota11 = metodoSelectorNotas();
            nota12 = metodoSelectorNotas();
            nota13 = metodoSelectorNotas();
            nota14 = metodoSelectorNotas();
            nota15 = metodoSelectorNotas();
            nota16 = metodoSelectorNotas();
            nota17 = metodoSelectorNotas();
            nota18 = metodoSelectorNotas();
            nota19 = metodoSelectorNotas();
            nota20 = metodoSelectorNotas();
            nota21 = metodoSelectorNotas();
            nota22 = metodoSelectorNotas();
            nota23 = metodoSelectorNotas();
            nota24 = metodoSelectorNotas();
            nota25 = metodoSelectorNotas();
            nota26 = metodoSelectorNotas();
            nota27 = metodoSelectorNotas();

            System.out.println(nota1 + " " + nota2 + " " + nota3 + " " + nota4 + " | " + nota5 + " " + nota6 + " " + nota7 + " " + nota8 +" | "+ nota9 + " " + nota10 + " " + nota11 + " " + nota12 + " | " + nota13 + " " + nota14 + " " + nota15 + " " + nota16 +" | " + nota17 + " " + nota18 + " " + nota19 + " " + nota20 +" | " + nota21 + " " + nota22 + " " + nota23 + " " + nota24+" | " + nota25 + " " + nota26 + " " + nota27 + " " + nota1 + " ||");
        }

    }
    //METODOS
    public static String metodoSelectorNotas(){
        int X= (int) (Math.random()*7);
        String notaMetodo = "";
        if (X == 0){
            notaMetodo = "do";
        }
        if (X == 1){
            notaMetodo = "re";
        }
        if (X == 2){
            notaMetodo = "mi";
        }
        if (X == 3){
            notaMetodo = "fa";
        }
        if (X == 4){
            notaMetodo = "sol";
        }
        if (X == 5){
            notaMetodo = "la";
        }
        if (X == 6){
            notaMetodo = "si";
        }
        return notaMetodo;
    }
    public static int metodoCompases(){
        int compasMetodo;
        int max=6;
        int min=0;
        int repeticion = 0;
        compasMetodo = (int) (Math.random() * (max - min));
        if (compasMetodo == 0){
            repeticion=4;
        }
        if (compasMetodo == 1){
            repeticion=8;
        }
        if (compasMetodo == 2){
            repeticion=12;
        }
        if (compasMetodo == 3){
            repeticion=16;
        }
        if (compasMetodo == 4){
            repeticion=20;
        }

        if (compasMetodo == 5){
            repeticion=24;
        }

        if (compasMetodo == 6){
            repeticion=28;
        }
        return repeticion;
    }
}
