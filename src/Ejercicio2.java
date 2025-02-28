import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else if (numero == 0) {
            System.out.println("El numero es cero");
        } else {
            System.out.println("El numero es impar");
        }

        if (numero % 3 == 0 && numero % 4 == 0) {
            System.out.println("El numero es multiplo de El numero es multiplo de 3 y 4");
        }
        else if (numero % 4 == 0) {
            System.out.println("El numero es multiplo de 4");
        } else if (numero % 3 == 0) {
            System.out.println("El numero es multiplo de 3");
        }
    }
}
