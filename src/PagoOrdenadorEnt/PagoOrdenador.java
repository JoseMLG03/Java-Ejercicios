package PagoOrdenadorEnt;


import java.util.Scanner;

public class PagoOrdenador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*MENU SELECCION ORDENADOR*/
        PagoOrdenadorObj MenuOrdenador = new PagoOrdenadorObj();
        MenuOrdenador.metodoMenuOrdenador();
        System.out.println(MenuOrdenador.precioMarca);
        /*MENU SELECCION PAGO*/
        PagoOrdenadorObj MenuPago = new PagoOrdenadorObj();
        MenuPago.metodoMenuPago();








}}


