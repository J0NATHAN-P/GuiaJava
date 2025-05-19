import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Desarrollar un programa que solicite el número de partidos ganados,
        //empatados y perdidos, de un equipo en el torneo apertura. El programa debe
        //mostrar la cantidad de puntos obtenidos, sabiendo que un gane vale 3 puntos,
        //un empate 1 y una derrota 0.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Partidos de un equipo en el torneo apretura \n");

        System.out.println("Ingrese el número de partidos ganados:");
        int ganados = entrada.nextInt();
        System.out.println("Ingrese el número de partidos empatados:");
        int empatados = entrada.nextInt();
        System.out.println("Ingrese el número de partidos perdidos:");
        int perdidos = entrada.nextInt();

        int pGanados = ganados * 3;
        int pObtenidos = pGanados + empatados;
        System.out.println("La cantidad de puntos obtenidos es:"+pObtenidos);
    }
}
