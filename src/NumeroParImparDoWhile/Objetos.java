package NumeroParImparDoWhile;

import java.util.Scanner;

public class Objetos {

    public int n;

    public Objetos(){}

    public void metodoNumeroImpar (){
        Scanner sc = new Scanner(System.in);
        do{
            n = sc.nextInt();
            if (n % 2 == 0){System.out.println("Es par");}

            else{
                System.out.println("Es impar");

            }
        }while (n % 2 == 0);

    }

}
