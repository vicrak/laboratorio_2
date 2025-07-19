//Liberias:

import java.util.Scanner;

public class actividad_3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double baseprice = 0;
        double discount = 0;

        System.out.println("Ingresa tu edad: ");
        int age = lector.nextInt();

        System.out.print("Introduce el numero de pendiendo al evento que quieras asistir: \n1. Concierto \n2. Torneo de futbol \n3. Torneo de fornite \nIngresa la opción que necesites:\n");

        int option = lector.nextInt();
        if (age < 15) {
            System.out.println("Eres menor de 15 años, no puedes asistir a ningún evento.");
        } else {

            switch (option) {
                case 1:
                    baseprice = 200000;
                    System.out.printf("Escogiste la opción de concierto. \nEl precio base es de: $ %.2f%n", baseprice);
                    if (age >= 15 && age <= 18) {
                        discount = 0.20;
                    } else if (age >= 50) {
                        discount = 0.30;
                    }
                    break;
                case 2:
                    baseprice = 500000;
                    System.out.printf("Escogiste la opción de torneo de futbol. \nEl precio base es de: $ %.2f%n", baseprice);
                    if (age >= 15 && age <= 18) {
                        discount = 0.20;
                    } else if (age >= 50) {
                        discount = 0.30;
                    }
                    break;
                case 3:
                    baseprice = 300000;
                    System.out.printf("Escogiste la opción del torneo de fornite. \nEl precio base es de: $ %.2f%n", baseprice);
                    if (age >= 15 && age <= 18) {
                        discount = 0.20;
                    } else if (age >= 50) {
                        discount = 0.30;
                    }
                    break;
                default:
                    System.out.println("Operación no reconocida");
                    break;
            }

        }

        //operación del descuento
        double finalPrice = baseprice - (baseprice * discount);

        // Resultados
        if (age < 15) {
            System.out.print("");
        } else {
            System.out.printf("Precio final es de: $ %.2f ", finalPrice);
            if (discount > 0) {
                System.out.printf("(Se aplicó un descuento del %.0f%%)", discount * 100);
            } else {
                System.out.println("(No se aplicó ningún descuento.)");
            }
        }
    }
}
