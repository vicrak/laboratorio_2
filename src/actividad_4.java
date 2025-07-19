//Libreria:

import java.util.Scanner;

public class actividad_4 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa el número de la opción dependiendo tu carrera: \n1. Ingeniería Civil \n2. Ciberseguridad \n3. Análisis de Datos \n4. Electrónica \n5. Diseño y Arte \n\nIngresa la opción: \n");
        int option = lector.nextInt();

        switch (option) {
            case 1:
                System.out.println("Carrera: Ingeniería Civil.");
                System.out.println("Lenguaje recomendado: Python.");
                System.out.println("Horas semanales: 8 - 12 horas.");
                System.out.println("Proyecto sugerido: Calculadora de áreas y volúmenes para diferentes estructuras.");
                break;
            case 2:
                System.out.println("Carrera: Ciberseguridad.");
                System.out.println("Lenguaje recomendado: Python o Bash.");
                System.out.println("Horas semanales: 10 - 14 horas.");
                System.out.println("Proyecto sugerido: Script para analizar contraseñas débiles en un archivo.");
                break;
            case 3:
                System.out.println("Carrera: Análisis de Datos.");
                System.out.println("Lenguaje recomendado: Python.");
                System.out.println("Horas semanales: 12 - 16 horas.");
                System.out.println("Proyecto sugerido: Análisis de un archivo CSV con estadísticas básicas.");
                break;
            case 4:
                System.out.println("Carrera: Electrónica.");
                System.out.println("Lenguaje recomendado: C/C++ - aplicado para arduino.");
                System.out.println("Horas semanales: 8 - 12 horas.");
                System.out.println("Proyecto sugerido: Control de luces LED con Arduino según sensor de movimiento.");
                break;
            case 5:
                System.out.println("Carrera: Diseño y Arte.");
                System.out.println("Lenguaje recomendado: JavaScript.");
                System.out.println("Horas semanales: 6 - 10 horas.");
                System.out.println("Proyecto sugerido: Animación interactiva basada en mouse o sonido.");
                break;
            default:
                System.out.println("Opción no encontrada");
                break;
        }
    }
}
