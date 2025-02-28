import java.awt.*;

public class string2 {
    public static void main(String[] args) {
        // Aqui veremos el texto var
        var texto = "Hola mundo";
        System.out.println(texto); // var va a deducir dependiendo de que coloques el tipo de dato que tiene

        // Operadores de comparacion
        int a = 10;
        int b = 20;
        System.out.println(a == b); // Es igual a...
        System.out.println(a != b); // Es distinto a...
        System.out.println(a > b); // Es mayor a ...

        System.out.println(a < b); // Es menor a...
        System.out.println(a >= b); // Es mayor o igual a...
        System.out.println(a <= b); // Es menor o igual a...

        // Operadores logicos
        boolean c = true;
        boolean d = false;
        boolean or = c || d; // Lo que hace esto es recorrer cada variable hasta encontrar un true
        boolean and = c && d; // Lo mismo que arriba, pero hasta encontrar un false

        boolean x = !c; // Transforma los datos en falso
        System.out.println(x);


        // Revisará si el cupon es igual al que se utiliza, y dara positivo
        String coupon = "chanchito-feli";
        boolean couponValid = coupon.equals("chanchito-triste") || coupon.equals("chanchito-feliz");
        System.out.println(couponValid);


    }
}
