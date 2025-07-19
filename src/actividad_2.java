//Librerias:
import java.util.Scanner;

public class actividad_2 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el numero de partidas jugadas:");
        int match = lector.nextInt();

        System.out.println("Ingrese el número de victorias:");
       int wins = lector.nextInt();

        System.out.println("Promedio de tiempo de juego en minutos:");
        int minutes = lector.nextInt();

        //Calculo de minutos
        double percent = ((double) wins / match) * 100;
        System.out.printf("Porcentaje de Victorias: %.2f%% \n", percent);

        //cálculo del total de los minutos jugados
        int totalminuts = minutes * match;
        System.out.println("Total de minutos jugados: " + totalminuts);

        //calculo de horas
        double horas = totalminuts / 60.0;
        System.out.printf("Horas totales jugadas: %.2f", horas);
    }
}
