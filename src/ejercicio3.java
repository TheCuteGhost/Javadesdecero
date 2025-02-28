import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        while (true) {

            System.out.println("Ingrese opcion: ");
            System.out.println( "1. Sumar" );
            System.out.println("2. Hackear");
            System.out.println("3. Salir");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("1")) {
                System.out.println("Ingrese el primer numero: ");
                int num1 = sc.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                int num2 = sc.nextInt();
                int suma = num1 + num2;
                System.out.println("La suma es: " + suma);
                continue;
            }
            else if (input.equals("2")) {
                System.out.println("Esto es un hackeo");
                continue;
            } else {
                System.out.println("Opcion invalida");
                continue;
            }
        }
    }
}
