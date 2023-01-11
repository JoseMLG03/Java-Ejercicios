package PagoOrdenadorEnt;

import java.util.Scanner;

public class PagoOrdenadorObj {
    public PagoOrdenadorObj(){}
    public int precioMarca;
    public void metodoMenuOrdenador(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija la marca del ordenador que desea comprar");
        System.out.println("1=MSI->1600€  2=ASUS->1300€ 3=DELL->600€");
        int Marca = sc.nextInt();
        switch (Marca){
            case 1:
                precioMarca = precioMarca+1600;
                break;
            case 2:
                precioMarca = precioMarca+1300;
                break;
            case 3:
                precioMarca = precioMarca+600;
        }
    }

    public void metodoMenuPago(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Que metodo de pago le gustaria hacer");
        System.out.println("1->Al contado   2->En 6 Meses    3->En 12 Meses");
        int metodoPago = sc.nextInt();
        switch (metodoPago){
            case 1:

                System.out.println("El precio total será "+ precioMarca);
                break;
            case 2:
                System.out.println("El precio total será "+ (precioMarca+(8%precioMarca)) +" (8% de mensualidad añadida)");
                break;
            case 3:
                System.out.println("El precio total será "+ (precioMarca+(12%precioMarca)) + " (12% de mensualidad añadida)");
        }

        System.out.println("¿Esta seguro? True/False");


    }



}
