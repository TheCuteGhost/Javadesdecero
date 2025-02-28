import java.util.Scanner;

public class interaccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        byte valor = sc.nextByte();
        System.out.println("Tu edad es: ");
        System.out.println(valor);


    }
}
