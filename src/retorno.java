public class retorno {
    public static void main(String[] args) {
        int resultado = suma(1, 34);
        int resultado1 = suma(21, 12, 123);
        System.out.println(resultado);
        System.out.println(resultado1);

        String texto = suma();
        System.out.println(texto);
    }

    static int suma(int numero1, int numero2 ) {
        return numero1 + numero2;
    }

    static int suma(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }

    public static String suma() {
        return "Hola";
    }
}
