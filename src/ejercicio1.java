import java.util.Scanner;

public class ejercicio1 {
    /**
     * Haz una calculadora donde el usuario de 2 numeros
     * y se imprima el resultado sumando estos dos
     * El programa debe decirle al usuario que hacer.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la sumadora");
        System.out.println("Introduce el primer numero: ");
        long numero1 = sc.nextLong();
        System.out.println("Introduce el segundo numero: ");
        long numero2 = sc.nextLong();
        System.out.println("El resultado de la suma es : " + (numero1 + numero2));
    }
}
