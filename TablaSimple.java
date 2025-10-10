public class TablaSimple {
    public static void main(String[] args) {
        int id1 = 1;
        String nombre1 = "Ratón";
        double precio1 = 15.9;
        int id2 = 2;
        String nombre2 = "Teclado";
        double precio2 = 25;
        String fin = "Fin de la tabla";

        System.out.printf("ID\tNombre\t\tPrecio%n%04d\t%s\t\t%.2f%n%04d\t%s\t\t%.2f%n%s",id1, nombre1, precio1, id2, nombre2, precio2, fin);
    }

}
