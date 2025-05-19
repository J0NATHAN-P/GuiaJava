import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Desarrollar un programa que solicite el sueldo de un empleado y como
        //resultado muestre el monto a descontar en concepto de renta, sabiendo que:
        //si el sueldo es menor que $500.00 el descuento es de $0.00, si el sueldo es
        //igual o mayor a $500.00 y menor que $750.00 el descuento es del 5% del
        //monto del sueldo y si el sueldo es igual o mayor que $750.00 el descuento es
        //del 10% del monto del sueldo.

        System.out.println("Calcular descuento de renta \n");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el sueldo de un empleado:");
        double sueldo = entrada.nextDouble();

        if(sueldo < 500)
            System.out.println("El sueldo no tiene descuento \n Su sueldo es igual a: " + sueldo);
        else if (sueldo >= 500 && sueldo < 750) {
            double sueldo5descuento = sueldo - 0.05;
            System.out.println("El sueldo tiene 5% de descuento \n Su sueldo es igual a: " + sueldo5descuento);
        } else if (sueldo >= 750) {
            double sueldo10descuento = sueldo - 0.10;
            System.out.println("El sueldo tiene 10% de descuento \n Su sueldo es igual a: " + sueldo10descuento);
        }
        else
        System.out.println("Ingrese un sueldo valido");

    }
}
