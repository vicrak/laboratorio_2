//librerias:

import java.util.Scanner;

public class actividad_1 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        //Usuario ingresa el nombre
        System.out.println("Ingrese su nombre:");
        String name = lector.nextLine();
        System.out.println("Te has registrado como " + name);

        System.out.println("Ingresa porfavor 3 números diferentes, que sean de tipo entero:");

        //Usuario ingresa los 3 números enteros
        System.out.println("Ingresa el primer numero:");
        int num1 = lector.nextInt();

        System.out.println("Ingresa el segundo numero:");
        int num2 = lector.nextInt();

        System.out.println("Ingresa el tercer numero:");
        int num3 = lector.nextInt();

        //Salen el nombre y números
        System.out.println("¡Hola " + name + "! Has ingresado los números: " + num1 + ", " + num2 + " y " + num3);

        System.out.println("¿Puedes adivinar qué operación hice para obtener este resultado?");

        /* Calcular la expresión, primero se van a multiplicar entre sí todas las variables, luego se le sumara 20,
        después de eso se divide por el valor de la variable "numero1", y por ultimo al resultado de todo se le aplicara la secuencia Fibonacci, con un rango de 10*/

        int resultado1 = num1 * num2 * num3 + 20 / num1;

        int n = 10;

        for (int i = 0; i < n; i++) {
            int siguiente = resultado1 + num2;
            resultado1 = num2;
            num2 = siguiente;
        }
        System.out.print("Resultado: " + resultado1);
    }
}
