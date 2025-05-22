import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Desarrollar un programa que permita almacenar 16 nombres de elementos
        //químicos en una matriz llamada “elementos”, posteriormente el programa
        //deberá mostrar el contenido de las filas y columnas con índices pares de la
        //matriz. Nota: el número de elementos a mostrar es de 4 y deberán mostrarse
        //en formato de matriz, es decir, simulando filas y columnas.

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Ejercicio 4");

        String[][] elementos = new String[5][5];

        //Llenado de la matriz
        for(int f = 1; f <= 4; f++)
        {
            for (int c = 1; c <= 4; c++)
            {
                System.out.println("Escriba el nombre de una elemento [" + f + "][" + c + "]");
                elementos[f][c] = scanner.next();
            }
        }

        for (int f = 1; f <= 4; f++)
        {
            if ((f%2) != 0) {
                for (int c = 1; c <= 4; c++) {
                    if ((c%2) !=0)
                    {
                        System.out.print(elementos[f][c] + "\t" );
                    }
                    }
                System.out.println("\n");
            }
        }
    }
}


//+"["+f+"]["+c+"]"
