public class Condicionales {
    public static void main(String[] args) {
        int edad = 18;
        String calsificacion = "R18";
        boolean isR18 = calsificacion.contains("R");
        if (isR18 && edad >= 18) {
            System.out.println("Puedes ver la pelicula");
        }
        else {
            System.out.println("No puedes ver la pelicula");
        }
    }
}
