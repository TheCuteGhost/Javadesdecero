import java.util.Scanner;

public class refactorizacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true) {
            monstrandomenu();
            input = sc.next().toLowerCase();
            if (input.equals("1")) {
                int resultado = suma(sc);
                System.out.println("El resultado es: " + resultado);
                continue;
            } else if (input.equals("2")) {
                hackear();
                continue;
            } else if (input.equals("3")) {
                System.out.println("Adios");
                break;
            } else {
                System.out.println("Opcion invalida");
                continue;
            }
        }
    }

    static void monstrandomenu() {
        System.out.println("Ingrese opcion: ");
        System.out.println("1. Sumar");
        System.out.println("2. Hackear");
        System.out.println("3. Salir");

    }

    static void hackear() {
        System.out.println("Hackeando...");
    }

    static int suma(Scanner sc){
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        return num1 + num2;
    }
}
