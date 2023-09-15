import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        System.out.println("Ingresa números enteros positivos. Para finalizar, ingresa -1.");

        while (true) {
            System.out.print("Ingresa un número: ");
            int numero = sc.nextInt();

            if (numero == -1) {
                break;
            }

            if (numero > 0) {
                suma += numero;
                contador++;
            } else {
                System.out.println("Por favor, ingresa un número entero positivo.");
            }
        }

        if (contador > 0) {
            double promedio;
            promedio = (double) suma / contador;  // promedio
            System.out.println("La suma total es: " + suma);
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }

    }
}