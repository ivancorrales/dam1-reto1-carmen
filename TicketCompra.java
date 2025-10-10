import java.util.Scanner;

public class TicketCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intrduzca el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Introduca el precio/unidad: ");
        double precio = sc.nextDouble();
        System.out.print("Introduzca el número de unidades compradas: ");
        int unidades = sc.nextInt();
        String cosa = "***********************";

        final double IVA = 0.21;

        double total = precio * unidades * (1 + IVA);

        System.out.printf("Producto: %s%nPrecio/Unidad: %.2f €%nUnidades: %d%nIVA: 21%% %nTOTAL: %.2f €%n%s", nombre, precio, unidades, total, cosa);
        
        sc.close();
    }

}
