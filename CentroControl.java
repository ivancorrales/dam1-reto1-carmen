import java.util.Scanner;

public class CentroControl {
    static Scanner sc = new Scanner(System.in);

    public static void mostrarSaludo() {
        System.out.printf("%nIntroduce tu nombre/apodo: ");
        String nombre = sc.nextLine();
        System.out.printf("Hola, bienvenid@ %s", nombre);
    }

    public static void calcularDescuento() {
        final double DESCUENTO = 0.1;
        System.out.printf("%nIntroduce el precio de un producto: ");
        double precio = sc.nextDouble();
        double precioDescuentado = precio * (1 - DESCUENTO);
        System.out.printf("El precio descontado es: %.2f €", precioDescuentado);
    }

    public static void evaluarTemperatura() {
        System.out.printf("%n¿Qué temperatura hace? ");
        double temperatura = sc.nextDouble();
        // Usando if-else nos ahorramos evaluaciones innecesarias
        if (temperatura <= 15) {
            System.out.println("Frío");
        } else if (temperatura >= 16 && temperatura <= 25) {
            System.out.println("Templado");
        } else {
            System.out.println("Calor");
        }
    }

    public static void mostarResumen() {
        System.out.printf("%nIntroduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.printf("Hola %s hoy es 11/10/2025", nombre);
    }

    public static void main(String[] args) {
        System.out.printf("=== CENTRO DE CONTROL ===%n1. Mostrar saludo%n2. Calcular descuento%n3. Evaluar temperatura%n4. Mostrar Resumen%nElige una opción (1-4): ");
        int opcion = sc.nextInt();
        sc.nextLine();
        // Nos ahorramos evaluaciones innecesarias con if-else
        if (opcion == 1) {
            mostrarSaludo();
        } else if (opcion == 2) {
            calcularDescuento();
        } else if (opcion == 3) {
            evaluarTemperatura();
        } else if (opcion == 4) {
            mostarResumen();
        } else {
            System.out.println("Opción no válida");
        }
    }

}
