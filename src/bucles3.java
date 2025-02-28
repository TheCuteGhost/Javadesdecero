public class bucles3 {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Maria", "Pedro"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
