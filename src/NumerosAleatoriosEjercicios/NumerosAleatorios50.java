package NumerosAleatoriosEjercicios;

public class NumerosAleatorios50 {public static void main(String[] args) {
    int cont = 0;
    do {
        /*if (metodoGenerarNumerosEntre2Valores()>100 && metodoGenerarNumerosEntre2Valores()<199){
        System.out.print(metodoGenerarNumerosEntre2Valores()+" no ");/*
        if (cont == 15){
            System.out.println(metodoGenerarNumerosEntre2Valores()+" ");
        }
        if (cont == 31){
            System.out.println(metodoGenerarNumerosEntre2Valores()+" ");
        }*/
        cont=cont+1;

    }while(cont != 49);
}
    public static int metodoGenerarNumerosEntre2Valores() {
        int max = 199;
        int min = 1;
        int numeroX = (int) (Math.random() * (max + min));
        System.out.println(numeroX +"numero");
        return numeroX;
    }

}
