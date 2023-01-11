package NUMEROSprimos;

import java.util.Scanner;

public class numeroObjeto {
    public int n;
    public int nc;

    public int contador=0;
    public numeroObjeto (){}

    public void metodoNprimo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Desde que numero quiere saber los primos hasta el 1");
        n = sc.nextInt();
        nc = n;
        do {
             if ((n % 2 == 0)){
                 System.out.println("el " +n+ " es primo");
             }
             else {
                 System.out.println("el " +n+ " no es primo");
             }
            contador=contador+1;
             n=n-1;
        }while (contador != nc);

    }
}


