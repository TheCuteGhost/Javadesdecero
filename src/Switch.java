public class Switch {
    public static void main(String[] args) {
        String action = "Agregar";
        switch (action) {
            case "Agregar":
                System.out.println("Agregando");
                break;
            case "Eliminar":
                System.out.println("Eliminando");
                break;

            default:
                System.out.println("No se reconoce la accion");
        }
    }
}
