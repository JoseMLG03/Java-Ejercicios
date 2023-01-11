package ProblemaDeNumeroMaxMediaSinprimo;

public class Programa {
     static int Numero;
     static int max;
     static int Cont;
     static int Acum;

    public static void main(String[] args) {
        do {
            Clase ClaseprogramaScanner = new Clase();
            ClaseprogramaScanner.metodoScanner();

            Clase ClaseprogramaMedia = new Clase();
            ClaseprogramaMedia.metodoConteoMedia();

            Clase ClaseprogramaMayor = new Clase();
            ClaseprogramaMayor.metodoPares();

        }while (Numero>0);

        System.out.println("El mayor numero par es "+max+" y la media de negativos es ");






} }
