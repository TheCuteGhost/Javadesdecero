import java.util.Arrays;
import java.util.Locale;

public class strings {
    public static void main(String[] args) {
        // Asi se declara un string
        String nombre = "Hola mundo";
        System.out.println(nombre);
        // Asi es para poder sacar el numero de caracteres que tenga un texto
        int largo = nombre.length();
        System.out.println(largo);
        // Aqui rempalzaremos una palabra dentro de un string para remplazarla
        String texto = nombre.replace("Hola", "Adios");
        System.out.println(texto);
        // Esto sirve para que te de un true o false dependiendo si este termina con el argumento inscrito
        System.out.println(texto.endsWith("undo"));
        System.out.println(texto.startsWith("ch")); // Esto es para buscar si empieza en
        System.out.println(texto.contains("undo")); // Esto busca si contiene algo
        System.out.println(texto.indexOf("undo")); // Esto busca y te dice donde esta la palabra que buscas
        System.out.println(texto.toUpperCase()); // Pone todo en mayusculas
        String malo = "                 as   ";
        System.out.println(malo.trim()); // Borra los espacios

        // Poner "" en un string
        String escapestr = "Hola \"Mundo\"";
        System.out.println(escapestr);

        // Arrays
        int[] numeros = new int[5];
        numeros[0] = 1; // Remplazamos un numero del array
        numeros[4] = 7;
        System.out.println(Arrays.toString(numeros)); // Muestra lo que tiene la Array
        Arrays.sort(numeros); // Ordena de menor a mayo
        System.out.println(Arrays.toString(numeros));
        // Arrays dentro de Arrays
        int[][] numnumeros = new int[3][2]; // Aqui es para decirle cuantas array crea y cuanto espacio tiene
        numnumeros[0][0] = 5; // Esto sirve para remplazar un numero dentro de una array en una array especifica
        System.out.println(Arrays.deepToString(numnumeros));
        // Es posible crear una array con array que contengan más array
        // int[][][] numnumeros2 = new int[3][2][1];

        // Constantes
        // String empresa = "Mazda"; // No es una constante
        // empresa = "Toyota"; // Aqui si cambia la variable porque no es una constante
        // System.out.println(empresa);

        final String empresa = "Mazda";
        // empresa = "toyota"; // Arroja error porque no se puede cambiar una constante
        System.out.println(empresa);

        // Operadores aritmeticos
        int a = 1 + 1;
        int b = 2 - 2;
        int c = 3 * 3;
        float d = 4f / 4f; // Para hacer diviciones en java se debe poner como un float y colocar las f en los numeros
        int e = 5 % 5;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);

        // Para sumar 1 en una variable se utiliza 2 operadores ++; dependiendo de donde se coloquen hara algo antes o despues
        int x = 5;
        System.out.println(++x); // Aqui sumara 1 a la variable y luego lo mostrara
        System.out.println(x++); // Aqui se mostrara y luego se sumara 1


        // Jerarquia de operaciones en java
        int r = (5 + 5) * 3;
        System.out.println(r);

        // Conversion de datos implícita
        byte dato1 = 1;
        float dato2 = 3.22f;
        double resultado = dato1 + dato2; // Siempre que se quiera sumar un numero el resultado tendra que ser mayor a los que se estan sumando
        System.out.println(resultado);
        // Conversion de datos explicita
        int ejem1 = 2;
        float ejem2 = 2.2f;
        int res = (int) (ejem1 + ejem2);
        System.out.println(res);

        // Ahora con strings
        String j = "1.1";
        int k = 5;
        double l = Double.parseDouble(j) + k; // Double.parseDouble convertira un string en un double
        System.out.println(l);

        // Clase Math
        System.out.println(Math.abs(-5)); // Pasa los negativos a positivos
        System.out.println(Math.ceil(10.0001)); // Redondeara al numero siguiente
        System.out.println(Math.floor(10.9999999)); // Redondeara al numero anterior
        System.out.println(Math.max(2,10)); // Mostrará el numero mayor
        System.out.println(Math.min(2,10)); // Mostrará el numero menor
        System.out.println(Math.round(15.5)); // Redondeara al numero más cercano

        double random = Math.random(); // Guardará un numero random en la variable random
        System.out.println((int) (random * 100)); // Aqui quitaremos todos los decimales

        // Fomato de numeros
    }
}
