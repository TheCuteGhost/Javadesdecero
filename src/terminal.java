import java.util.Scanner;

public class terminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while (!input.equals("exit")) {
            System.out.println("Ingresa un comando: ");
            input = sc.nextLine().toLowerCase();
        }
        System.out.println( "Hasta luego");
    }
}
