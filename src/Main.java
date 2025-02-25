public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Tipos de datos
        // Existen diferentes tipos de datos para numeros y variables

        // Para los numeros tenemos diferentes tipso de datos como
        // byte que sirve para guardar numeros entre -128 al 127 y solo pesa 1 byte
        // short para guardar numeros entre -32768 al 32767 \\ 2 byte
        // int para guardar numeros entre -2mm al 2mm \\ 4 byte
        // long para guardar numeros entre -9x10^16 al 9x10^16 \\ 8 byte
        byte edad = 18;
        System.out.println(edad);

        // Para los decimales existen 2 tipos de datos
        // float sirve para guardar menos numeros 3,4e-038 \\ 4 byte
        // double sirve para guardar mas numeros0 4,9e-324 \\ 8 byte
        // ademas que si se quiere usar en un numero este debe terminar en f o F
        float edad2 = 18.5f;
        System.out.println(edad2);

        // los booleanos solo tienen dos estados false, true \\ 2 bytes
        boolean IsActive = true;
        System.out.println(IsActive);

        // Los datos char son para guardar un Caracter y se usa '' y no "" \\ 2byte
        char caracter = 'a';
        System.out.println(caracter);

    }
}