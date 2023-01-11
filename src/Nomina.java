import java.util.Scanner;

public class Nomina {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Introduzca nombre de empleado");
        String nombreEmpleado = sc.nextLine();

        System.out.println("Introduzca su sueldo base");
        float sueldoBase = Float.parseFloat(sc.nextLine());

        System.out.println("Introduzca su porcentaje de descuento");
        float porcDescuento = Float.parseFloat(sc.nextLine());

        System.out.println("Introduzca numero de horas extras trabajadas");
        byte numeroHorasTrabajadas = sc.nextByte();

        System.out.println("Precio x Hora");
        float precioHora = sc.nextInt();

        System.out.println("Mes actual");
        String mesActual = sc.nextLine();

        System.out.println("-Mes: " + mesActual);
        System.out.println("-Nómina del Empleado: " + sueldoBase );
        System.out.println("-Sueldo Base: " + sueldoBase);
        System.out.println("-porcentajeDeDescuento: " + porcDescuento +" 21%");
        System.out.println("-HorasExtras: " + numeroHorasTrabajadas+ precioHora);
        System.out.println("-Descuentos: " + porcDescuento*(sueldoBase+numeroHorasTrabajadas)/100);
        System.out.println("-Diferencia: " + (sueldoBase-porcDescuento));
        System.out.println("-Sueldo neto: "+ (sueldoBase-porcDescuento) + (numeroHorasTrabajadas+ precioHora));
    }
}
