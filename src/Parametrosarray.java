public class Parametrosarray {
    public static void main(String[] args) {
        int r = suma(new int[] {1, 2, 343, 23, 323, 2});
        System.out.println(r);
    }

    static int suma(int[] numeros) {
        int resultado = 0;
        for (int numero: numeros) {
            resultado += numero;
        }

        return resultado;
    }
}
