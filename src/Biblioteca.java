import java.util.Scanner;


public class Biblioteca {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("1");
        String Mes = sc.nextLine();

        System.out.println("2");
        int Cantidaddelibros = sc.nextInt();

        System.out.println("3");
        String titulodellibro = sc.nextLine();

        System.out.println("4");
        byte numerodeconsultasdelibro = sc.nextByte();

        System.out.println("5");
        int totaldeprestamos = sc.nextInt();

        int tasa = (numerodeconsultasdelibro * 100) / totaldeprestamos;

        System.out.println("el libro "+titulodellibro+" se consultó "+numerodeconsultasdelibro+" veces.\n" +
                "La tasa de consulta en el mes de "+Mes+" es "+ tasa +" %");
    }
}