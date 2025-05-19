import java.util.Scanner;

public class Ejercicio3 {
    //Desarrollar un programa que solicite un número entero positivo y como
    //resultado muestre todos los números impares entre 0 y el número ingresado.
    //Utilizar la estructura repetitiva “For”.
    public static void main(String[] args) {
        System.out.println("Mostrar impares entre 0 y el numero ingresado \n");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo:");
        int numeroEntero = entrada.nextInt();


        for (int i = 0; i <= numeroEntero; i++)
        {
            int residuo = i % 2;
            if (residuo != 0)
                System.out.println(i);
        }
    }
}
