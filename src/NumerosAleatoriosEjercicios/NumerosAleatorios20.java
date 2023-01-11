package NumerosAleatoriosEjercicios;

public class NumerosAleatorios20 {
    public static void main(String[] args) {
        int cont = 0;
    do {
        System.out.print(metodoGenerarNumerosEntre2Valores()+" ");
        cont=cont+1;
    }while(cont != 19);
    }
    public static int metodoGenerarNumerosEntre2Valores() {
        int max = 10;
        int min = 0;
        int numeroX = (int) (Math.random() * (max - min));
        return numeroX;
    }

}
