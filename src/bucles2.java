import java.util.Scanner;

public class bucles2 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println( "El valor de i es: " + i);
            i++;
            // Do while es para que se ejecute el comando y luego cheque la condición de while
        } while (i < 10);

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while (true) {
            System.out.println("Ingresa un comando: ");
            input = sc.nextLine().toLowerCase();
            if (input.equals("exit")) {
                break;
            }
            if (input.equals("continue")) {
                continue;
            }

            System.out.println("Esta linea no se ejecutara");
        }
    }
}
