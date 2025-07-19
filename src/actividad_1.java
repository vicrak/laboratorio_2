//librerias:
import java.util.Scanner;

public class actividad_1 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        //Usuario ingresa el nombre
        System.out.println("Ingrese su nombre:");
        String nombre = lector.nextLine();
        System.out.println("Te has registrado como " + nombre);

        System.out.println("Ingresa porfavor 3 números diferentes, que sean de tipo entero:");

        //Usuario ingresa los 3 números enteros
        System.out.println("Ingresa el primer numero:");
        int numero1 = lector.nextInt();

        System.out.println("Ingresa el segundo numero:");
        int numero2 = lector.nextInt();

        System.out.println("Ingresa el tercer numero:");
        int numero3 = lector.nextInt();

        //Salen el nombre y números
        System.out.println("¡Hola " + nombre + "! Has ingresado los números: " + numero1 + ", " + numero2 + " y " + numero3);

        System.out.println("¿Puedes adivinar qué operación hice para obtener este resultado?");

        /* Calcular la expresión, primero se van a multiplicar entre sí todas las variables, luego se le sumara 20,
        después de eso se divide por el valor de la variable "numero1", y por ultimo al resultado de todo se le aplicara la secuencia Fibonacci, con un rango de 10*/

        int resultado1 = numero1 * numero2 * numero3 + 20 / numero1;

        int n = 10;

        for (int i = 0; i < n; i++) {
            int siguiente = resultado1 + numero2;
            resultado1 = numero2;
            numero2 = siguiente;
        }
        System.out.print("Resultado: " + resultado1);

    }
}
